package robo;

public class Main {

	public static void main(String[] args) {
		
		Plano p = new Plano(8, 8);
		
		Robo r = new Andador(1, "andador", p);
		r.Avançar();
		p.verificarSeTemRobo();
		r.Retroceder();
		p.verificarSeTemRobo();

		
	
	}
	

}
