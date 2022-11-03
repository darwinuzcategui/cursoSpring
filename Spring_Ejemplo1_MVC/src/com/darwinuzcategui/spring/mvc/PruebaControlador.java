package com.darwinuzcategui.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/secundaria")
public class PruebaControlador {
	
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() { //proporciona el formulario
		
		return "HolaAlumnosFormulario";
		
	}
	
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		
		return "HolaAlumnosSpring";
		
		
	}
	
	@RequestMapping("/procesarFormulario2")
	//public String otroProcesosFormulario(HttpServletRequest request, Model modelo) {
	public String otroProcesosFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo) {
		
		// String nombre=request.getParameter("nombreAlumno");
		
		nombre+=" es el peor alumno";
		
		String mensajeFinal="¿Quién es el peor alumno?"+ nombre;
		
		//agregando informacion al modelo
		
		modelo.addAttribute("mensajeClaro",mensajeFinal);
		
		
		return "HolaAlumnosSpring";
		
		
	}
	

}
