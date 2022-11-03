package com.darwinuzcategui.IoC;

public class DirectorEmpleado implements Empleados {
	
	//Creación de campo tipo Creación Informe(interfaz)
	
	private CreacionInformes informeNuevo;
	
	//Creación de contructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo=informeNuevo;
	}
	

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la Direcion de los empleados**";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informes a los Directortes de los dpto..**:"+informeNuevo.getInforme();
	}
	
	// metodo init. Ejecutar tarea antes de que bean este deponible
	
	public void metodoInicial() {
		
		System.out.println("dentro de metodo  Inicio, ante que bean este diponible**");
		
	}
	
	// metodo destroy, ejecuta tarea cuando después que le bean haya sido utilizados
	
public void metodoFinal() {
		
		System.out.println("dentro de metodo  Destroy, aqui va las tarea despues de finalizar el bean");
		
	}
	
	

}
