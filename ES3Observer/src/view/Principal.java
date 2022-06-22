package view;

import controller.Aleatorio;
import controller.Observadora;

public class Principal {

	public static void main(String[] args) {
		Observadora observadora = new Observadora();
		Aleatorio aleatorio = new Aleatorio(observadora);

		aleatorio.geraAleatorio();
	}

}
