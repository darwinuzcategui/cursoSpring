package com.darwinuzcategui.pruebaAnnptations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component("ComercialExperimentadoAnotacion")
//si no coloca id el toma el nombre de la clase como id
@Component
// para utilizar el PostConstruct y PreDestroy no se puede utilizar prototype
// @Scope("prototype")
public class ComercialExperimentado implements Empleados {
	
	// ejecución de código depues de creación del Bean
	
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		
		System.out.println("Ejecutado tras creación de Bean");
	}
	
	
	
	// ejecución de código depues de apagado contendor Spring
	
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecuta antes de la destrucción");
	}
	
	public ComercialExperimentado() {
		
	}
	
	/*
	@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	*/
	
	/*
	@Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	*/
	
	/*
	@Autowired
	public void queDaMasElnombrenoImportaNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	*/
	
	@Autowired
	@Qualifier("informeFinancieroTrim3") //bean id que debe utilizar
	private CreacionInformeFinanciero nuevoInforme;

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender , Bender y Más Ventas";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		//return "Informe Generado por Comercial";
		return nuevoInforme.getInformeFinanciero();
	}

}
