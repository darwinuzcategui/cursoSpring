package com.darwinuzcategui.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDEmoSingletonPrototype {

	public static void main(String[] args) {
		
		
		// cargar el xml2 de configuracion
		
		ClassPathXmlApplicationContext contexto =new ClassPathXmlApplicationContext("aplicationContext2.xml");
		
		// peticion de beans al contenedor spring
		
		SecretarioEmpleado yasmin=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		SecretarioEmpleado darwin=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		SecretarioEmpleado maria=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		SecretarioEmpleado jose=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
	
		SecretarioEmpleado juan=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		
		
		
		
		
		System.out.println(yasmin);
		
		System.out.println(darwin);
		
		System.out.println(maria);
		
		System.out.println(jose);
		
		System.out.println(juan);
		
		
		
		/*
		if(yasmin==darwin) System.out.println("Apuntan al mismo Objeto (dirrecion de memorias");
		else System.out.println("No se trata de mismo objeto en memoria");
		*/
		

	}

}
