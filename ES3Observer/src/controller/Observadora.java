package controller;

public class Observadora implements IObservador, IAleatorio {

	@Override
	public void geraAleatorio() {
	}

	@Override
	public void update(int num) {
		if (num % 2 == 0) {
			System.out.println("PAR!");
		} else {
			System.out.println("ÍMPAR!");
		}
	}

}
