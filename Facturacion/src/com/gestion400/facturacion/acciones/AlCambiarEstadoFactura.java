package com.gestion400.facturacion.acciones;

import org.openxava.actions.*;

import com.gestion400.facturacion.modelo.*;


/**
 * Acción a ejecutar cuando cambie la referencia cliente en el módulo Factura
 */
public class AlCambiarEstadoFactura extends OnChangePropertyBaseAction{

	@Override
	public void execute() throws Exception {
		
		EstadoFactura estado = (EstadoFactura) getNewValue();
		
		if(EstadoFactura.PENDIENTE.equals(estado)) {
			
			getView().setHidden("fechaPago", true);
			
		} else {
			
			getView().setHidden("fechaPago", false);
		}
	}
}
