package com.gestion400.facturacion.acciones;

import java.math.*;
import java.util.*;

import org.openxava.actions.*;
import org.openxava.model.*;

import com.gestion400.facturacion.modelo.*;

/**
 * Acción para el modo lista de las FacturasPagadas
 */
public class VerTotal extends TabBaseAction {

	@Override
	public void execute() throws Exception {
		
		BigDecimal total = BigDecimal.ZERO;

		for (Map key: getTab().getAllKeys()) {
			
			Factura factura = (Factura)MapFacade.findEntity(getModelName(), key);
			
			total = total.add(factura.getImporteTotal());
		}
		
		addInfo("VerTotal.total", total);	// i18n
	}
}
