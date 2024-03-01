package br.com.academy10.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //identifica a classe como controller
public class HomeController {
	
	@GetMapping("/") //Se refere a URL dessa pagina
	public ModelAndView index() {
		ModelAndView nv = new ModelAndView(); 
		nv.setViewName("home/index");
		nv.addObject("msg", "mensagem vinda diretamente do controller" );
		return nv;
	}

}
