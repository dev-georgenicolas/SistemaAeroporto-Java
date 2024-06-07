import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int opAux;

        do {
            System.out.println("## Menu de Gerenciamento ##");
            System.out.println("1. Companhias");
            System.out.println("2. Aviões");
            System.out.println("3. Pilotos");
            System.out.println("4. Passageiros");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                	                   
                    do {
                    	System.out.println("---------------------");
                        System.out.println("## Companhias ##");
                    	System.out.println("1 - Cadastrar Companhia");
                    	System.out.println("2 - Exibir Companhia");
                    	System.out.println("3 - Voltar");
                    	System.out.print("Escolha uma opção: ");
                    	opAux = scanner.nextInt();
                              	
                    	switch(opAux) {
                    	case 1:
                    		System.out.println("Cadastro conclúido!");
                    		break;
                    	case 2:
                    		System.out.println("Lista atualmente não disponivel.");
                    		break;
                    	case 3:
                    		System.out.println("Voltando");
                    		break;
                    	default:
                    		System.out.println("Opção inválida, tente novamente.");
                    	
                    	}
                    }while(opAux!=3);
                    opAux = 0;
                                        
                case 2:
                	 do {
                     	System.out.println("---------------------");
                         System.out.println("## Aviões ##");
                     	System.out.println("1 - Cadastrar Avião");
                     	System.out.println("2 - Exibir Avião");
                     	System.out.println("3 - Voltar");
                     	System.out.print("Escolha uma opção: ");
                     	opAux = scanner.nextInt();
                               	
                     	switch(opAux) {
                     	case 1:
                     		System.out.println("Cadastro do avião conclúido!");
                     		break;
                     	case 2:
                     		System.out.println("Lista atualmente não disponivel.");
                     		break;
                     	case 3:
                     		System.out.println("Voltando");
                     		break;
                     	default:
                     		System.out.println("Opção inválida, tente novamente.");
                     	
                     	}
                     }while(opAux!=3);
                     opAux = 0;
                case 3:
                	 do {
                     	System.out.println("---------------------");
                         System.out.println("## Pilotos ##");
                     	System.out.println("1 - Cadastrar Piloto");
                     	System.out.println("2 - Exibir Piloto");
                     	System.out.println("3 - Voltar");
                     	System.out.print("Escolha uma opção: ");
                     	opAux = scanner.nextInt();
                               	
                     	switch(opAux) {
                     	case 1:
                     		System.out.println("Cadastro do Piloto conclúido!");
                     		break;
                     	case 2:
                     		System.out.println("Lista atualmente não disponivel.");
                     		break;
                     	case 3:
                     		System.out.println("Voltando");
                     		break;
                     	default:
                     		System.out.println("Opção inválida, tente novamente.");
                     	
                     	}
                     }while(opAux!=3);
                     opAux = 0;
                case 4:
                	 do {
                     	System.out.println("---------------------");
                         System.out.println("## Passageiros ##");
                     	System.out.println("1 - Cadastrar Passageiros");
                     	System.out.println("2 - Exibir Passageiros");
                     	System.out.println("3 - Voltar");
                     	System.out.print("Escolha uma opção: ");
                     	opAux = scanner.nextInt();
                               	
                     	switch(opAux) {
                     	case 1:
                     		System.out.println("Cadastro do Passageiro conclúido!");
                     		break;
                     	case 2:
                     		System.out.println("Lista atualmente não disponivel.");
                     		break;
                     	case 3:
                     		System.out.println("Voltando");
                     		break;
                     	default:
                     		System.out.println("Opção inválida, tente novamente.");
                     	
                     	}
                     }while(opAux!=3);
                     opAux = 0;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }
}
