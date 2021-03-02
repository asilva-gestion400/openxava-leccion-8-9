package com.gestion400.facturacion.acciones;

import org.openxava.actions.*;

public class IniciarEnSoloLectura extends SearchByViewKeyAction {
	
	public void execute() throws Exception {
		super.execute();
		getView().setEditable(false);
	}
}
