package com.generation;

public class Tacos {
	String tipoDeTortilla;
	String tipoDeGuisado;
	String tipoDeSalsa;
	int numeroDeTortilla;
	float precio;
	
	
	
	void preparar() {
		System.out.println("Preparando tu rico taco");
	}
	
	void vender() {
		System.out.println("Taco vendido");
	}
	
	void ponerSalsa() {
		System.out.println("Agregando salsa muy picante");
	}
	
	void subirPrecio(float aumento){
		precio = precio + aumento;
	}
	
	
	
	
	public Tacos() {
	
	}
	
	//El constructor nos ayuda a inicializar objetos
	public Tacos(String tipoDeTortilla, String tipoDeGuisado,
	String tipoDeSalsa, int numeroDeTortilla, float precio) {
		this.tipoDeTortilla = tipoDeTortilla; //con el this se 
		//refiere al atributo de la linea 4 y sin el this se refiere
		//al parametro del constructor
				
		this.tipoDeGuisado = tipoDeGuisado;
		this.tipoDeSalsa = tipoDeSalsa;
		this.numeroDeTortilla = numeroDeTortilla;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", tipoDeSalsa="
				+ tipoDeSalsa + ", numeroDeTortilla=" + numeroDeTortilla + ", precio=" + precio + "]";
	}
		
	
	
}
