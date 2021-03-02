package com.gestion400.facturacion.acciones;

import org.openxava.actions.*;

/**
 * Acción para el modo lista de las FacturasPagadas
 */
public class VerElementosSeleccionados extends TabBaseAction {

	@Override
	public void execute() throws Exception {
		
		addInfo("VerElementosSeleccionados.mensaje", getSelectedKeys().length);
	}
}
