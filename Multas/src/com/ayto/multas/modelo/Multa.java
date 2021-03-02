package com.ayto.multas.modelo;

import java.math.*;
import java.util.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.*;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;
import org.openxava.calculators.*;

import com.ayto.multas.acciones.*;
import com.ayto.multas.calculadores.*;

@View(members = 
	" anyo, fecha;" +
	" estado, articulo; " +
	" importe, porcentajeDescuento, importeConDescuento;" +
	" agente; " +
	" infractor; " +
	" vehiculoImplicado;segundoVehiculoImplicado;" +
	" observaciones")

@View(name="desdeInfractor" ,members = "anyo,fecha;estado;importe;agente")

@Tab(properties = "estado,anyo,fecha,importe, agente.codigo, agente.nombre, infractor.nif, infractor.nombre",
	 defaultOrder = "${fecha} DESC")

@Tab(name = "multasPendientes", 
	 properties = "estado, anyo,fecha,importe, agente.codigo, agente.nombre, infractor.nif, infractor.nombre",
	 defaultOrder = "${fecha} DESC",
	 baseCondition = "${estado} = 'PENDIENTE'")

@Tab(name= "multasPagadas", 
	 properties = "estado, anyo,fecha,importe, agente.codigo, agente.nombre, infractor.nif, infractor.nombre",
	 defaultOrder = "${fecha} DESC",
	 baseCondition = "${estado} = 'PAGADA'")
		
@Entity
public class Multa {
	
	 /* BeanValidator: si no es true devolver� error */
	@AssertTrue(
		message="importe_multa_incorrecto"	// i18n
	)
    private boolean isDatosErroneos() {
    	return !(getImporte() == null || getImporte().compareTo(BigDecimal.ZERO) <= 0);
    }

	@Id
    @Hidden // La propiedad no se muestra al usuario. Es un identificador interno
    @GeneratedValue(generator="system-uuid") // Identificador Universal �nico (1)
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(length=32)
    private String oid;
	
	@DefaultValueCalculator(value = CurrentYearCalculator.class)
	@Column(length = 4)
	private int anyo;
	
	@DefaultValueCalculator(value = CurrentDateCalculator.class)
	@Column
	private Date fecha;
	
	@Stereotype("DINERO")
	@Column(length = 12, scale = 2)
	private BigDecimal importe;
	
	@Stereotype("TEXTO_GRANDE")
	@Column(length = 100)
	private String observaciones;
	
	@ManyToOne @NoFrame
	@ReferenceView(value = "desdeMulta")
	private Agente agente;
	
	@ManyToOne @NoFrame
	@ReferenceView(value = "desdeMulta")
	private Infractor infractor;
	
	@DefaultValueCalculator(DefaultEstadoMultaCalculator.class)
	@OnChange(AlCambiarEstadoMulta.class)
	@Enumerated(EnumType.STRING)
	private EstadoMulta estado;
	
	@ManyToOne @NoCreate @NoModify
	@ReferenceView(value="VehiculoSimple")
	private Vehiculo vehiculoImplicado;
	
	@ManyToOne @NoCreate @NoModify
	@ReferenceView(value="VehiculoSimple")
	private Vehiculo segundoVehiculoImplicado;
	
	@Column(length = 3, scale = 2)
	private BigDecimal porcentajeDescuento;
	
	/* propiedad calculada */
	@Stereotype("MONEY")
	@Depends("porcentajeDescuento, importe")
	public BigDecimal getImporteConDescuento() {
		if(importe == null || porcentajeDescuento == null) return BigDecimal.ZERO;
		return importe.subtract(importe.multiply(porcentajeDescuento));
	}

	@ManyToOne 
	@DescriptionsList(descriptionProperties = "informacion")
	@OnChange(AlCambiarArticuloEnMulta.class)
	private Articulo articulo;
	
	
	/* */
	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getImporte() {
		return importe == null ? BigDecimal.ZERO : importe;
//		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

	public Infractor getInfractor() {
		return infractor;
	}

	public void setInfractor(Infractor infractor) {
		this.infractor = infractor;
	}

	public EstadoMulta getEstado() {
		return estado;
	}

	public void setEstado(EstadoMulta estado) {
		this.estado = estado;
	}

	public BigDecimal getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(BigDecimal porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public Vehiculo getVehiculoImplicado() {
		return vehiculoImplicado;
	}

	public void setVehiculoImplicado(Vehiculo vehiculoImplicado) {
		this.vehiculoImplicado = vehiculoImplicado;
	}

	public Vehiculo getSegundoVehiculoImplicado() {
		return segundoVehiculoImplicado;
	}

	public void setSegundoVehiculoImplicado(Vehiculo segundoVehiculoImplicado) {
		this.segundoVehiculoImplicado = segundoVehiculoImplicado;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
}
