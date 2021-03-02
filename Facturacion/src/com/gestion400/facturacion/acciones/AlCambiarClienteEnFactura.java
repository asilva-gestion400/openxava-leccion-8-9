package com.gestion400.facturacion.acciones;

import org.openxava.actions.*;
import org.openxava.jpa.*;
import org.openxava.util.*;

import com.gestion400.facturacion.modelo.*;

/**
 * Acci�n a ejecutar cuando cambie la referencia cliente en el m�dulo Factura
 */
public class AlCambiarClienteEnFactura extends OnChangePropertyBaseAction{

	@Override
	public void execute() throws Exception {
		// getNewValue(): valor de la propiedad cambiada
		
		Number numero = (Number) getNewValue();
		
		if(!Is.empty(numero)) {
			
			Cliente cliente = XPersistence.getManager().find(Cliente.class, numero);
			
			String observaciones = "";
			if (cliente != null) {
				// anotamos la direcci�n del cliente en las observaciones
				String direccion = cliente.getDireccion() != null ? cliente.getDireccion().getViaPublica() : "";
				
				observaciones = Labels.get("aEntregarEn") + "'" + direccion + "'";	
			}
			getView().setValue("observaciones", observaciones);
		}
	}
}
