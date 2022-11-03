package com.darwinuzcategui.pruebaAnnptations;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@Configurable
@ComponentScan("com.darwinuzcategui.pruebaAnnptations")
@PropertySource("classpath:datosEmpresas.propiedades")
public class EmpleadoConfig {
	
	// definir el bean para InformeFinancieroDptoCompra
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() { // sera id del bean inyectado
		
		return new InformeFinancieroDptoCompra();
		
	}
	
	
	// definir el bean para DirectorFinanciero e Inyectar dependencia
	@Bean
	public Empleados directorFinanciero() {
		
		return new DirectoFinanciero(informeFinancieroDtoCompras());
	}

}
