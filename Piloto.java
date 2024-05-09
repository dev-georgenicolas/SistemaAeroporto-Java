import java.util.Scanner;

public class Piloto {
	Scanner sc = new Scanner(System.in);
	int id;
	String nome;
	int cpf;
	int licencaAerea;
	
	public void CadastrarPiloto() {
		System.out.println("Cadastre o id do piloto:");
		this.id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Cadastre o nome do piloto:");
		this.nome = sc.next();
		
		System.out.println("Cadastre o cpf do piloto:");
		this.cpf = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Cadastre a licença aérea do piloto:");
		this.licencaAerea = sc.nextInt();
		sc.nextLine();
		
		
	}
	
	public void exibirPiloto() {
        System.out.println("Dados do Piloto:");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Licença Aérea: " + licencaAerea);
    }
	
}



