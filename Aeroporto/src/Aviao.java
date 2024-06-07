import java.util.Scanner;

public class Aviao {
	Scanner sc = new Scanner(System.in);
	private int id;
	private String modelo;
	private String poltronas;
	private double peso;
	private double velocidade;
	private double comprimento;

    public void cadastrar() {
        System.out.print("ID do Avião: ");
        this.id = sc.nextInt();
        sc.nextLine();

        System.out.print("Modelo: ");
        this.modelo = sc.nextLine();

        System.out.print("Número de Poltronas: ");
        this.poltronas = sc.nextInt();

        System.out.print("Peso: ");
        this.peso = sc.nextDouble();

        System.out.print("Velocidade: ");
        this.velocidade = sc.nextDouble();

        System.out.print("Comprimento: ");
        this.comprimento = sc.nextDouble();
    }

    
    public void exibir() {
        System.out.println("Informações do Avião:");
        System.out.println("ID: " + this.id);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Número de Poltronas: " + this.poltronas);
        System.out.println("Peso: " + this.peso);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Comprimento: " + this.comprimento);
    }
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAssentos() {
		return poltronas;
	}

	public void setAssentos(String assentos) {
		this.poltronas = assentos;
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