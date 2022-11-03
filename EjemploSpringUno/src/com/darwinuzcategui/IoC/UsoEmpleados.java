package com.darwinuzcategui.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creacion de objetos tipo empleaod
		// con la implemnetacion de la inteface
		// jefeEmpleado Empleado1 = new jefeEmpleado();
		/*
		Empleados Empleado1 = new jefeEmpleado();
		
		Empleados Empleado2 = new secretarioEmpleado();
		
		Empleados Empleado3 = new directorEmpleado();
		
		
		// uso de obejeto creado
		
		System.out.println(Empleado1.getTareas());
		System.out.println(Empleado2.getTareas());
		System.out.println(Empleado3.getTareas());
		*/
		ClassPathXmlApplicationContext contexto =new ClassPathXmlApplicationContext("aplicationContext.xml");
		
		JefeEmpleado darwin=contexto.getBean("miEmpleado", JefeEmpleado.class);
		System.out.println(darwin.getTareas());
		System.out.println(darwin.getInforme());
		System.out.println("Email:"+darwin.getEmail());
		System.out.println(darwin.getNombreEmpresa());
		
		
		// *************************************************************************
		
		
		/*
		
		SecretarioEmpleado yasmin=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(yasmin.getTareas());
		System.out.println(yasmin.getInforme());
		System.out.println("Email:"+yasmin.getEmail());
		System.out.println(yasmin.getNombreEmpresa());

		*/
		
		contexto.close();

	}

}
