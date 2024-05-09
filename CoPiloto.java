
public class CoPiloto extends Piloto {
	
	public void CadastrarCoPiloto() {
		System.out.println("Cadastre o id do co-piloto:");
		this.id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Cadastre o nome do co-piloto:");
		this.nome = sc.next();
		
		System.out.println("Cadastre o cpf do co-piloto:");
		this.cpf = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Cadastre a licença aérea do co-piloto:");
		this.licencaAerea = sc.nextInt();
		sc.nextLine();
		
		
	}
	
	public void exibirCoPiloto() {
        System.out.println("Dados do Co-Piloto:");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Licença Aérea: " + licencaAerea);
    }
}
