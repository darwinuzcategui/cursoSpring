package com.darwinuzcategui.pruebaAnnptations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentación de informe financiero trimenstre 1";
	}

}
