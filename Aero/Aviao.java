
public class Aviao {

	int id;
	String modelo;
	Object[] array = {"Piloto", "Copiloto"};
	
	public void listarPilotos() {
		for (Object elemento : array) {
			System.out.println(elemento);
		}
	}
	
	
	public void CadastrarPilotos(Piloto piloto, CoPiloto copiloto) {
		array[0] = piloto;
		array[1] = copiloto;
	}
	
	
}
