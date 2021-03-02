package com.gestion400.facturacion.acciones;

import org.openxava.actions.*;

public class EntrarEnModoDetalle extends TabBaseAction {

	@Override
	public void execute() throws Exception {
		
		if(getSelectedKeys().length == 1) {

			setNextMode(DETAIL);
			
			getView().setValue("oid", getSelectedKeys()[0].get("oid"));
			
			getView().findObject();
		}
	}

}
