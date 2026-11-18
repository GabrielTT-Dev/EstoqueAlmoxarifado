package projetofinalbes20262;
import java.util.Scanner;
public class EstoqueAlmoxarifado {

	public static void main(String[] args) {
		exibirMenu();
	}
	public static int exibirMenu() {
		Scanner ler = new Scanner(System.in);
		int opcao;
		do{ 
		System.out.println("====ESCOLHA==== \n"
				+ "1- Cadastrar Produto \n"
				+ "2- Listar Estoque \n"
				+ "3- Buscar Produto por Código \n"
				+ "4- Verificar Menor Estoque (Alerta) \n"
				+ "0- Sair");
		opcao = ler.nextInt();
			switch(opcao) {
		case 1:
			//Chamar modulo de cadastro
			break;
		case 2:
			// Chamar modulo de lista
			break;
		case 3:
			//Chamer modulo de busca por código
			break;
		case 4:
			// Chamar modulo de verificar estoque
			break;
		case 0:
			System.out.println("Encerrando Sistema...");
			break;
		default:
			System.out.println("Opçao Invalida");
			break;
			}
		}while(opcao < 0 || opcao > 4);
		return(opcao);
	}

}
