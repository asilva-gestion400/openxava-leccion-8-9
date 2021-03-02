package com.gestion400.facturacion.acciones;

import java.util.*;

import org.openxava.actions.*;


/**
 * Acci�n a ejecutar cuando cambie la referencia cliente en el m�dulo Factura
 */
public class AlCambiarFechaFactura extends OnChangePropertyBaseAction{

	@Override
	public void execute() throws Exception {
		
		Date fecha = (Date) getNewValue();
		
		addWarning("AlCambiarFecha.warning", fecha);
	}
}
