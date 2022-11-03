package com.darwinuzcategui.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {

		// cargar el xml de configuracion
		ClassPathXmlApplicationContext contexto =new ClassPathXmlApplicationContext("aplicationContext3.xml");
		
		//Obtener el bean 
		
		Empleados Darwin=contexto.getBean("miEmpleadoDirector", Empleados.class);
		
		System.out.println(Darwin.getInforme());
		
		
		// cerrar el contexto
		
		contexto.close();
		

	}

}
