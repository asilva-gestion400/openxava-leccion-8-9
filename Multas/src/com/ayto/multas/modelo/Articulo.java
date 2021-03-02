package com.ayto.multas.modelo;

import java.math.*;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.openxava.annotations.*;
import org.openxava.jpa.*;
import org.openxava.model.*;
import org.openxava.util.*;

import com.ayto.multas.validadores.*;

@Entity
@RemoveValidator(ValidarBorrarArticulo.class)
public class Articulo extends Identifiable {
	
	@AssertTrue(
		message = "descripcion_rellena_si_importe_mayor_cero"	// i18n
	)
	private boolean isValido() {
		if (getImporte() != null && getImporte().compareTo(BigDecimal.ZERO) > 0) {
			return !Is.empty(getDescripcion());
		}
		return true;
	}
	
	@Column(length = 3)
	private int articulo;
	
	@Column(length = 3)
	private String apartado;
	
	@Column(length = 3)
	private String opcion;
	
	@Column(length = 3)
	private String reglamento;
	
	@Stereotype("MONEY")
	private BigDecimal importe;
	
	@Stereotype("MEMO")
	private String descripcion;
	
	// @Depends("articulo, apartado, opcion, reglamento")
	@Hidden
	public String getInformacion() {
		return getArticulo() + " " + getApartado() + " " + getOpcion() + " " + getReglamento();
	}
	
	@Hidden
	public boolean hayMultasAsociadas(){
		if (Is.empty(getId())) return false;

		String sentencia = "from Multa where articulo.id = :idArticulo";
		Query query = XPersistence.getManager().createQuery(sentencia);
		query.setParameter("idArticulo", getId());
		return !query.getResultList().isEmpty();	
	}
	
	/* */
	
	public int getArticulo() {
		return articulo;
	}

	public void setArticulo(int articulo) {
		this.articulo = articulo;
	}

	public String getApartado() {
		return apartado;
	}

	public void setApartado(String apartado) {
		this.apartado = apartado;
	}

	public String getOpcion() {
		return opcion;
	}

	public void setOpcion(String opcion) {
		this.opcion = opcion;
	}

	public String getReglamento() {
		return reglamento;
	}

	public void setReglamento(String reglamento) {
		this.reglamento = reglamento;
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
