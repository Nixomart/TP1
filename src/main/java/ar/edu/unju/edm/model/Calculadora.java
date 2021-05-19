package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
	private int num1;
	private int num2;
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}
	public int Sumar() {
		return num1+num2;
	}
	public int Resta() {
		return num1-num2;
	}
	public int Division() {
		return num1/num2;
	}
	public int Multiplicacion() {
		return num1*num2;
	}
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
}
