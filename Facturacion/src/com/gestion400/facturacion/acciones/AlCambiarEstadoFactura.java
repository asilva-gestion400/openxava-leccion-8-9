package com.gestion400.facturacion.acciones;

import org.openxava.actions.*;

import com.gestion400.facturacion.modelo.*;


/**
 * Acci�n a ejecutar cuando cambie la referencia cliente en el m�dulo Factura
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
