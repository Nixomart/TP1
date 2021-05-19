package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Calculadora;

@Controller
public class CalculadoraController {
	
	@Autowired 
	Calculadora nuevaCalculadora;
	
	//Le envia una variable de tipo calculadora y devuelve una pagina "menu" que es menu.html
	@GetMapping("/calculadora")
	public String mostrarCalculadora(){
		return "menu";
	}
	
	//Coinide con el menu.html cuando va a mandar algo al backen
	@GetMapping("/calculoSuma")
	public ModelAndView calculoSuma(@RequestParam(name="num1") String num1,@RequestParam(name="num2") int num2) {
		
		nuevaCalculadora.setNum1(Integer.valueOf(num1));
		nuevaCalculadora.setNum2(num2);
		//resultadoSuma sera el resultado que se va mostrar en resultado.html
		int resultadoSuma=nuevaCalculadora.Sumar();
		//resultado coinicde con la pagina resultado.html
		ModelAndView modelo=new ModelAndView("resultado");
		modelo.addObject("resultadoSuma",resultadoSuma);
		return modelo;
	}
	
	@GetMapping("/calculoResta")
	public ModelAndView calculoResta(@RequestParam(name="num1") String num1,@RequestParam(name="num2") int num2) {
		
		nuevaCalculadora.setNum1(Integer.valueOf(num1));
		nuevaCalculadora.setNum2(num2);
		
		//resultadoSuma sera el resultado que se va mostrar en resultado.html
		int resultadoResta=nuevaCalculadora.Resta();
		//resultado coinicde con la pagina resultado.html
		ModelAndView modelo=new ModelAndView("resultado");
		modelo.addObject("resultadoSuma",resultadoResta);
		return modelo;
	}
	
	@GetMapping("/calculoDivision")
	public ModelAndView calculoDivision(@RequestParam(name="num1") String num1,@RequestParam(name="num2") int num2) {
		
		nuevaCalculadora.setNum1(Integer.valueOf(num1));
		nuevaCalculadora.setNum2(num2);
		
		//resultadoSuma sera el resultado que se va mostrar en resultado.html
		int resultadoDivision=nuevaCalculadora.Division();
		
		//resultado coinicde con la pagina resultado.html
		ModelAndView modelo=new ModelAndView("resultado");
		modelo.addObject("resultadoSuma",resultadoDivision);
		return modelo;
	}
	
	@GetMapping("/calculoMultiplicacion")
	public ModelAndView calculoMultiplicacion(@RequestParam(name="num1") String num1,@RequestParam(name="num2") int num2) {
		
		nuevaCalculadora.setNum1(Integer.valueOf(num1));
		nuevaCalculadora.setNum2(num2);
		
		//resultadoSuma sera el resultado que se va mostrar en resultado.html
		int resultadoMultiplicacion=nuevaCalculadora.Multiplicacion();
		
		//resultado coinicde con la pagina resultado.html
		ModelAndView modelo=new ModelAndView("resultado");
		modelo.addObject("resultadoSuma",resultadoMultiplicacion);
		return modelo;
	}
}
