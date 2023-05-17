package robo;

public class Celula {

	public int posicaoX;
	public int posicaoY;
	public int id;
	public Criatura criatura;	
	
	public Celula(int id, int x , int y) {
		posicaoX = x;
		posicaoY = y;
		this.id = id;
		criatura =null;
	}
	
	public String imprimir() {
		return "Celula:  " + id + " x: " + posicaoX + " y: " + posicaoY;
	}
}
