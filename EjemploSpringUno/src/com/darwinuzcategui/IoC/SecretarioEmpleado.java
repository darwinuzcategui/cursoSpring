package com.darwinuzcategui.IoC;

public class SecretarioEmpleado implements Empleados {
	
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la Angenda de los empleado";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return"Informes Secretario por setter ..:"+informeNuevo.getInforme();
	}
	
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
	
		
	private CreacionInformes informeNuevo;
	
	private String email;
	
	private String nombreEmpresa;

	

}
