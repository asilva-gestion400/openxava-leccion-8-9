package com.gestion400.facturacion.acciones;

import org.openxava.actions.*;

public class IrAlModoLista extends ViewBaseAction {

	@Override
	public void execute() throws Exception {
		
		setNextMode(LIST);
	}
}
