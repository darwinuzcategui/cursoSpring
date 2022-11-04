package com.darwin.Ioc;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Creación de objeto de tipo empelado
		// sin la intenface  JefeEmpleado Empleado1 = new JefeEmpleado();
		// con la interface
		
		Empleado Empleado1 = new JefeEmpleado();
		Empleado Empleado2 = new SecretarioEmpleado();
		Empleado Empleado3 = new DirectorEmpleado();
		
		
		// TODO Uso de los obejtos creados
		System.out.println("*****************************");
		System.out.println(Empleado1.getTareas());
		System.out.println(Empleado2.getTareas());
		System.out.println(Empleado3.getTareas());
		System.out.println("***************************");

	}

}
