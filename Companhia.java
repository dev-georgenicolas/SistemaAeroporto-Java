import java.util.Scanner;

public class Companhia {
    Scanner sc = new Scanner(System.in);
    String nome;
    String cnpj;
    String endereco;
    String numeroParaAtendimento;
   

    public void digitarNome() {
        System.out.println("Digite o nome da companhia:");
        nome = sc.nextLine();
    }

    public void digitarCnpj() { 
        System.out.println("Digite o CNPJ da companhia:");
        cnpj = sc.nextLine();
    }

    public void digitarEndereco() { 
        System.out.println("Digite o endereço da companhia:");
        endereco = sc.nextLine();
    }

    public void digitarNumeroParaAtendimento() {
        System.out.println("Digite o número para atendimento:");
        numeroParaAtendimento = sc.nextLine();
    }

   
}
  

