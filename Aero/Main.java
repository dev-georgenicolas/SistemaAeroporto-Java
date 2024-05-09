
public class Main {

	public static void main(String[] args) {
		
		Piloto p1 = new Piloto();
		p1.id = 1;
		p1.nome = "Nepo";
		
		CoPiloto cp1 = new CoPiloto();
		cp1.id = 1;
		cp1.nome = "Wlad";
		
		Aviao a1 = new Aviao();
		a1.id = 1;
		a1.modelo = "A-G12";
		
		a1.CadastrarPilotos(p1, cp1);
		
		
		Piloto p2 = new Piloto();
		p2.id = 1;
		p2.nome = "Nico";
		
		CoPiloto cp2 = new CoPiloto();
		cp2.id = 1;
		cp2.nome = "Pedrin";
		
		Aviao a2 = new Aviao();
		a2.id = 1;
		a2.modelo = "A-G76";
		
		a2.CadastrarPilotos(p2, cp2);
		
		
		System.out.println(a1.modelo);
        a1.listarPilotos();

        System.out.println(a2.modelo);
        a2.listarPilotos();
	}

}
