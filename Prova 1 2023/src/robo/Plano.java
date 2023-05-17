package robo;

import java.util.ArrayList;

public class Plano {
	public Celula[][] listaCelulas;

	public Plano(int tamanhox, int tamanhoy) {
		listaCelulas = new Celula[tamanhox][tamanhoy];

			int contador = 1;
			for (int i = 0; i < tamanhox; i++) {
				for (int j = 0; j < tamanhoy; j++) {
					Celula celula = new Celula(contador, i, j);
					listaCelulas[i][j]=celula;
					contador++;
				}
			}
	}

	public void verificarSeTemRobo() {
		for (int i = 0; i < listaCelulas.length; i++) {
			for (int j = 0; j <listaCelulas[i].length; j++) {
				Celula aux=listaCelulas[i][j];
				if (listaCelulas[i][j].criatura != null) {
					System.out.println("tem robo: " + aux.criatura.tipo + "- x: " + aux.posicaoX + "  - y: " + aux.posicaoY);
				}
	        }
	    }
	}


	public Celula retornarCelula(int x, int y) {
		for (int i = 0; i < listaCelulas.length; i++) {
			for (int j = 0; j <listaCelulas[i].length; j++) {
				if (listaCelulas[i][j].posicaoX == x && listaCelulas[i][j].posicaoY == y) {
					return listaCelulas[i][j];
				}
	        }
	    }
		return null;
	}

	public void retornarCelulas() {
		for (int i = 0; i < listaCelulas.length; i++) {
			for (int j = 0; j <listaCelulas[i].length; j++) {
				System.out.println(listaCelulas[i][j].imprimir());
	        }
	    }
	}

}
