package view;

import controller.SomaController;

public class Principal {

	public static void main(String[] args) {
		SomaController pc = new SomaController();
		int n = 5;
		int somatoria = pc.soma(n);
		System.out.println("Resultado da soma = " +somatoria);
	}

}
