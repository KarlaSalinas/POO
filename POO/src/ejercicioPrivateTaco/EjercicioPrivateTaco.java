package ejercicioPrivateTaco;

public class EjercicioPrivateTaco {
	private String tipoDeTortilla;
	private String tipoDeGuisado;
	private String tipoDeSalsa;
	private int numeroDeTortilla;
	private float precio;
	
	
	
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
	
	
	public void setTipoDeTortilla(String tipoDeTortilla) { 
		this.tipoDeTortilla = tipoDeTortilla;
	}
	
	public String getTipoDeTortilla() { 
		return tipoDeTortilla;
		}
	
	public void setTipoDeGuisado(String tipoDeGuisado) { 
		this.tipoDeGuisado = tipoDeGuisado;
	}
	
	public String getTipoDeGuisado() { 
		return tipoDeGuisado;
	}
	
	public void setTipoDeSalsa(String tipoDeSalsa) { 
		this.tipoDeSalsa = tipoDeSalsa;
	}
	
	public String getTipoDeSalsa() { 
		return tipoDeSalsa;
	}
	
	public void setNumeroDeTortilla(int numeroDeTortilla) { 
		if(numeroDeTortilla <= 0 || numeroDeTortilla < 3) {
			this.numeroDeTortilla = numeroDeTortilla;
		}else{
			throw new IllegalArgumentException("No pueden ser más de 2 tortillas, ni menos de 1");
		}
	}
	
	public int getNumeroDeTortilla() { 
		return numeroDeTortilla;
	}
	
	public void setPrecio(int precio) { 
		this.precio = precio;
	}
	
	public float getPrecio() { 
		return precio;
	}

	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", tipoDeSalsa="
				+ tipoDeSalsa + ", numeroDeTortilla=" + numeroDeTortilla + ", precio=" + precio + "]";
	}
}
