package com.gestion400.facturacion.acciones;

import org.openxava.actions.*;
import org.openxava.jpa.*;
import org.openxava.model.*;

import com.gestion400.facturacion.modelo.*;

public class ClonarFacturaOpcion1 extends TabBaseAction {

	@Override
	public void execute() throws Exception {
		
		if(getSelectedKeys().length == 1) {
			
			Factura factura = (Factura) MapFacade.findEntity("Factura", getSelectedKeys()[0]);
			
			Factura facturaClonada = new Factura();
			
			facturaClonada.setAnyo(factura.getAnyo());
			
			facturaClonada.setNumero(factura.getNumero());
			
			facturaClonada.setFecha(factura.getFecha());
			
			facturaClonada.setCliente(factura.getCliente());
			
			facturaClonada.setEstado(factura.getEstado());
			
			facturaClonada.setObservaciones(factura.getObservaciones());
			
			XPersistence.getManager().persist(facturaClonada);
		}
	}
}
