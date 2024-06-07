import java.util.Scanner;

public class Piloto {
	Scanner sc = new Scanner(System.in);
	protected String rg;
	protected String nome;
	protected String cpf;
	protected int licencaAerea;
	
	public void CadastrarPiloto() {
		System.out.println("Cadastre o id do piloto:");
		this.rg = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Cadastre o nome do piloto:");
		this.nome = sc.next();
		
		System.out.println("Cadastre o cpf do piloto:");
		this.cpf = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Cadastre a licença aérea do piloto:");
		this.licencaAerea = sc.nextInt();
		sc.nextLine();
		
		
	}
	
	public void exibirPiloto() {
        System.out.println("Dados do Piloto:");
        System.out.println("RG: " + rg);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Licença Aérea: " + licencaAerea);
    }

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getLicencaAerea() {
		return licencaAerea;
	}

	public void setLicencaAerea(int licencaAerea) {
		this.licencaAerea = licencaAerea;
	}
	
}



