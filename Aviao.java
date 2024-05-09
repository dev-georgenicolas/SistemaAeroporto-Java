import java.util.Scanner;

public class Aviao {
	
	public String modelo;
	public int assentos;
	public double peso;
	public double velocidade;
	public double comprimento;

	public void cadastrarAviao() {
        	System.out.println("Digite o modelo do avião:");
        	this.modelo = sc.nextLine();
        	System.out.println("Digite a quantidade de assentos do avião:");
        	this.assentos = sc.nextInt();
		sc.nextLine();
        	System.out.println("Digite o peso do avião:");
        	this.peso = sc.nextDouble();
        	System.out.println("Digite a velocidade do avião:");
		this.velociade = sc.nextDouble();
		System.out.println("Digite o comprimento do avião:");
		this.comprimento = sc.nextDouble();
       		System.out.println("Avião cadastrado com sucesso!");
    }
	
	
	
}




