package ejercicioPrivateTaco;

import com.generation.Tacos;

public class MainTaco extends EjercicioPrivateTaco{

	public static void main(String[] args) {
		MainTaco taquito = new MainTaco();
		
		taquito.setTipoDeTortilla("Maíz");
		taquito.setTipoDeGuisado("Suadero");
		taquito.setTipoDeSalsa("Roja");
		taquito.setNumeroDeTortilla(2);
		taquito.setPrecio(20);
		
		System.out.println(taquito);

	}

}
