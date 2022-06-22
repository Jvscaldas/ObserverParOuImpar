package controller;

import java.util.Random;

public class Aleatorio implements IAleatorio, IObservavel {

	private Observadora observadora;
	private int num;

	public Aleatorio(Observadora observadora) {
		this.observadora = observadora;
	}

	@Override
	public void notificaMudanca(int num) {
		observadora.update(num);
	}

	@Override
	public void geraAleatorio() {
		for (int i = 0; i < 100; i++) {
			num = new Random().nextInt(100);
			System.out.println(num);
			notificaMudanca(num);
		}
	}

}
