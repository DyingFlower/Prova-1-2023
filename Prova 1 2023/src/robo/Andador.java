package robo;

public class Andador extends Robo {

	public Andador(int id, String nome, Plano plano) {
		super(id, nome, plano);
		tipo="Andador";
	}

	
	public void Avançar() {
		plano.listaCelulas[posicaox][posicaoy].criatura= null;
		posicaoy++;
		plano.listaCelulas[posicaox][posicaoy].criatura= this;
	}

	public void Retroceder() {
		plano.listaCelulas[posicaox][posicaoy].criatura= null;
		posicaoy--;
		plano.listaCelulas[posicaox][posicaoy].criatura= this;
	}

}
