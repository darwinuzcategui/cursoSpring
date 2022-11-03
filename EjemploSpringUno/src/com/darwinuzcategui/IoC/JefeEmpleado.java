package com.darwinuzcategui.IoC;

public class JefeEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo;
	
	private String email;
	
	private String nombreEmpresa;

	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		
		return "Gestionar las Actividades realativa a los empleados de mi dpto";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return"Gestionar Informes de las Actividades realativa a los jefes: "+informeNuevo.getInforme();
	}
	
	// getter -setter
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	
	
}
