package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Provincia;

@Controller
public class ProvinciaController {
	
	//llamamos a crear unaProvincia de tipo Provincia
	@Autowired
	Provincia unaProvincia;

	//con el model hacemos que se pase al metodo cargaProvincia
	//y el model.add.. se manda al html
	
	@GetMapping ({"/provincia"})
	public String cargaProvincia(Model model) {
		unaProvincia.setNombreProvincia("Salta Argentina");
		model.addAttribute("nico", unaProvincia);
		return "provincia";
	}
}
