
public class Aviao {
	
	public String modelo;
	public int assentos;
	public double peso;
	public double velocidade;
	public double comprimento;
	
	
	public Aviao(String modelo, int assentos, double peso, double velocidade, double comprimento) {
		super();
		this.modelo = modelo;
		this.assentos = assentos;
		this.peso = peso;
		this.velocidade = velocidade;
		this.comprimento = comprimento;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getAssentos() {
		return assentos;
	}


	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}


	public double getComprimento() {
		return comprimento;
	}


	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	
	
}




