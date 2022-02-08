package com.gatitos;

public class PruebaGato extends Gato{
	public static void main (String[] args) {
		PruebaGato g = new PruebaGato();
		
		g.setNombre("Taco");
		g.setPatas(4);
		g.setAdoptado(false);
		
		System.out.println(g);
	}
}
