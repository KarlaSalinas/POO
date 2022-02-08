package com.gatitos;

public class Gato {
	//atributos
	private String nombre;
	private int patas;
	private boolean adoptado;
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		if(patas >= 0 && patas < 5) {
			this.patas = patas;
		}else {
			//Excepciones
			throw new IllegalArgumentException("El número de patas no es válido");
		}
	}
	
	public boolean isAdoptado() { //is, porque se hace una pregunta
		return this.adoptado;
	}
	
	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}

	
	//Método toString
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + ", adoptado=" + adoptado + "]";
	}
	
}
