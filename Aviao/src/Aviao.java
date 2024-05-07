
public class Aviao {

	int id;
	String modelo;
	Object[] pilotos = new Object[2];
	
	
	public void CadastrarPilotos(Piloto piloto, CoPiloto copiloto) {
		this.pilotos[0] = piloto;
		this.pilotos[1] = copiloto;
	}
	
	
}
