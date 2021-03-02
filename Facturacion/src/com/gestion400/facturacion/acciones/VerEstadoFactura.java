package com.gestion400.facturacion.acciones;

import org.openxava.actions.*;

import com.gestion400.facturacion.modelo.*;

/**
 * Acción para el modo detalle
 */
public class VerEstadoFactura extends ViewBaseAction {

	@Override
	public void execute() throws Exception {
		
		EstadoFactura estado = (EstadoFactura) getView().getValue("estado");
		
		addMessage("VerEstadofactura.ver", estado);	// i18n 
	}
}
