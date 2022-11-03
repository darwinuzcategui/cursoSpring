package com.darwinuzcategui.pruebaAnnptations;

import org.springframework.beans.factory.annotation.Value;

public class DirectoFinanciero implements Empleados {
	
	

	public DirectoFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}
	
	public String getEmail() {
		return email;
	}



	public String getNombreEmpresa() {
		return nombreEmpresa;
	}



	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestión de la Operaciones finaciera";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}
	
	private CreacionInformeFinanciero  informeFinanciero;
	
	@Value("${email}")
	private String email;
	
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;

}
