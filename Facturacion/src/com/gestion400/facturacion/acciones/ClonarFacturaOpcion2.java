package com.gestion400.facturacion.acciones;

import org.apache.commons.beanutils.*;
import org.openxava.actions.*;
import org.openxava.jpa.*;
import org.openxava.model.*;

import com.gestion400.facturacion.modelo.*;

public class ClonarFacturaOpcion2 extends TabBaseAction {

	@Override
	public void execute() throws Exception {
		
		if(getSelectedKeys().length == 1) {
			
			Factura factura = (Factura) MapFacade.findEntity("Factura", getSelectedKeys()[0]);
			
			Factura facturaClonada = (Factura) BeanUtils.cloneBean(factura);
			
			facturaClonada.setOid(null);
			
			facturaClonada.setDetallesFactura(null); //Limpiar colecciones referenciadas
			
			XPersistence.getManager().persist(facturaClonada);
		}
	}
}
