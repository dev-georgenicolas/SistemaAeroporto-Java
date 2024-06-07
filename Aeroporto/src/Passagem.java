import java.util.Scanner;

public class Passagem {
    Scanner sc = new Scanner(System.in);

    private String nome;
    private String classe;
    private double preco;
    private String assento;
    private String horarioSaida;
    private String horarioChegada;
    private String origem;
    private String destino;
    private String portao;
    private String voo;

    public void criarPassagem() {
        System.out.println("Digite seu nome:");
        nome = sc.nextLine();

        System.out.println("Escolha a classe da passagem:");
        System.out.println("1. Classe Econômica");
        System.out.println("2. Classe Executiva");
        System.out.println("3. Primeira Classe");
        
        int opcaoClasse;
        do {
        	opcaoClasse = sc.nextInt();
            sc.nextLine(); 
        	
        	switch (opcaoClasse) {
            case 1:
                classe = "Classe Econômica";
                preco = 879.0;
                break;
            case 2:
                classe = "Classe Executiva";
                preco = 1130.0;
                break;
            case 3:
            	classe = "Primeira Classe";
            	preco = 1780.0;
            	break;
            default:
                System.out.println("Opção inválida.");
        	}
        }while(opcaoClasse <=0 || opcaoClasse >=4);

        

        System.out.println("Digite o horário de saída do voo:");
        horarioSaida = sc.nextLine();
        
        System.out.println("Digite o horário de chegada do voo:");
        horarioChegada = sc.nextLine();

        System.out.println("Digite a origem do voo:");
        origem = sc.nextLine();

        System.out.println("Digite o destino do voo:");
        destino = sc.nextLine();

        System.out.println("Digite o número do assento:");
        assento = sc.nextLine();

        System.out.println("Digite o portão de embarque:");
        portao = sc.nextLine();

        System.out.println("Digite o número do voo:");
        voo = sc.nextLine();
    }

    public void exibirPassagem() {
        System.out.println("Passagem de: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Preço: " + preco);
        System.out.println("Horário de Saída: " + horarioSaida);
        System.out.println("Horário de Chegada: " + horarioChegada);
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Assento: " + assento);
        System.out.println("Portão: " + portao);
        System.out.println("Número do Voo: " + voo);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getAssento() {
		return assento;
	}

	public void setAssento(String assento) {
		this.assento = assento;
	}

	public String getHorarioSaida() {
		return horarioSaida;
	}

	public void setHorarioSaida(String horarioSaida) {
		this.horarioSaida = horarioSaida;
	}
	
	
	public String getHorarioChegada() {
		return horarioChegada;
	}

	public void setHorarioChegada(String horarioChegada) {
		this.horarioChegada = horarioChegada;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getPortao() {
		return portao;
	}

	public void setPortao(String portao) {
		this.portao = portao;
	}

	public String getVoo() {
		return voo;
	}

	public void setVoo(String voo) {
		this.voo = voo;
	}
    
}
