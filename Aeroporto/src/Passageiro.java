
import java.util.Scanner;

public class Passageiro {
	Scanner scanner = new Scanner(System.in);
    private String nome;
    private String cpf;
    private String rg;
    private String email;
    private String telefone;
    
    public void cadastrarPassageiro() {
       
        System.out.print("Nome: ");
        this.nome = scanner.nextLine();

        System.out.print("CPF: ");
        this.cpf = scanner.nextLine();

        System.out.print("RG: ");
        this.rg = scanner.nextLine();

        System.out.print("Email: ");
        this.email = scanner.nextLine();

        System.out.print("Telefone: ");
        this.telefone = scanner.nextLine();
    }

    public void exibirPassageiro() {
        System.out.println("Informações do Passageiro:");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);
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
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
