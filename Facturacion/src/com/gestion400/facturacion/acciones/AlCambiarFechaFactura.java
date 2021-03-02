package com.gestion400.facturacion.acciones;

import java.util.*;

import org.openxava.actions.*;


/**
 * Acción a ejecutar cuando cambie la referencia cliente en el módulo Factura
 */
public class AlCambiarFechaFactura extends OnChangePropertyBaseAction{

	@Override
	public void execute() throws Exception {
		
		Date fecha = (Date) getNewValue();
		
		addWarning("AlCambiarFecha.warning", fecha);
	}
}
