package com.darwinuzcategui.pruebaAnnptations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotatios2 {

	public static void main(String[] args) {

		// leer el xmls de configuracion
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("aplicationContext.xml");
		//leer el class de configuracion
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadoConfig.class);
		

		// pedir un bean al contenedor

		//Empleados Felipe = contexto.getBean("comercialExperimentado", Empleados.class);
		//Empleados Darwin = contexto.getBean("comercialExperimentado", Empleados.class);
		//Empleados empleado=contexto.getBean("directorFinanciero",Empleados.class);
		
		DirectoFinanciero empleado=contexto.getBean("directorFinanciero",DirectoFinanciero.class);

		// usar el bean
		System.out.println("Email: "+empleado.getEmail());
		System.out.println(empleado.getNombreEmpresa());

		// ¿apunta al mismo objeto en memoria?
		/*
		if (Darwin == Felipe) {

			System.out.println("APunta al mismo lugar en memoria");
			System.out.println(Darwin + "\n" + Felipe);

		} else {

			System.out.println("Apunta al difrentes lugar en memoria");
			System.out.println(Darwin + "\n" + Felipe);

		}
*/
		// cerrar el contexto
		contexto.close();

	}

}
