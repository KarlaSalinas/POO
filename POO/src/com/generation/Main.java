package com.generation;


public class Main{

	public static void main(String[] args) {
	
		Tacos taco1 = new Tacos("Maíz", "Suadero", "Roja", 2, 15);
		
		/*taco1.tipoDeTortilla = "Maíz";
		taco1.tipoDeGuisado = "Suadero";
		taco1.numeroDeTortilla = 2;
		taco1.tipoDeSalsa = "Roja";
		taco1.precio = 15;*/
		//taco1.subirPrecio(5.5f);
		
		System.out.println(taco1.toString());
		
		Tacos taco2 = new Tacos("Harina", "Bisteck", "Verde", 1, 20.6f);
		/*
		taco2.tipoDeTortilla = "Harina";
		taco2.tipoDeGuisado = "Bisteck";
		taco2.numeroDeTortilla = 1;
		taco2.tipoDeSalsa = "Verde";
		taco2.precio = 20.6f;*/
		taco2.tipoDeTortilla = "Trigo"; //reasignación del tipo de tortilla
		System.out.println(taco2.toString());
	}

}
