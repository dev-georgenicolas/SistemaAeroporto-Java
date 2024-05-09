import java.util.Date;

public class Passagem {
	String classe;
	double preco;
	String assento;
	float horario;
	String destino;
	String portao;
	String voo;
	String nome;
	String origem;
	
	public Passagem (String classe, double preco, String assento, float horario, String destino, String portao, String voo, 
			String nome, String origem) {
		this.classe = classe;
		this.preco = preco;
		this.horario = horario;
		this.assento = assento;
		this.destino = destino;
		this.origem = origem;
		this.voo = voo;
		this.portao = portao;
		
	}
}
