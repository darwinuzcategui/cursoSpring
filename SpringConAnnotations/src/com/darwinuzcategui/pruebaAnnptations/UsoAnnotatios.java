package com.darwinuzcategui.pruebaAnnptations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotatios {

	public static void main(String[] args) {
		
		// leer el xmls de configuracion
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("aplicationContext.xml");
		
		
		// pedir un bean al contenedor
		
		//Empleados DarwinFelipe=contexto.getBean("ComercialExperimentadoAnotacion", Empleados.class);
		Empleados DarwinFelipe=contexto.getBean("comercialExperimentado", Empleados.class);
		
		
		// usar el bean
		System.out.println(DarwinFelipe.getTareas());
		System.out.println(DarwinFelipe.getInforme());
		
		// cerrar el contexto
		contexto.close();
		
		

	}

}
