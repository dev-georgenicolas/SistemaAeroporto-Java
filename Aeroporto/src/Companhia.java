import java.util.Scanner;

public class Companhia {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private String cnpj;
    private String endereco;
    private String numeroAtendimento;

    public void cadastrarCompania() {
        System.out.print("Nome da Companhia: ");
        this.nome = sc.nextLine();

        System.out.print("CNPJ: ");
        this.cnpj = sc.nextLine();

        System.out.print("Endereço: ");
        this.endereco = sc.nextLine();

        System.out.print("Número para Atendimento: ");
        this.numeroAtendimento = sc.nextLine();
    }

    public void exibirCompania() {
        System.out.println("Informações da Companhia:");
        System.out.println("Nome: " + this.nome);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Número para Atendimento: " + this.numeroAtendimento);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumeroAtendimento() {
		return numeroAtendimento;
	}

	public void setNumeroAtendimento(String numeroAtendimento) {
		this.numeroAtendimento = numeroAtendimento;
	}
    

	

   
}
  

