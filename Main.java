import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorContatos gerenciador = new GerenciadorContatos();

        while (true) {
            System.out.println("\nGerenciador de Contatos");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Listar Contatos");
            System.out.println("3. Remover Contato");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Contato: ");
                    String nomeAdicionar = scanner.nextLine();
                    System.out.print("Telefone do Contato: ");
                    String telefoneAdicionar = scanner.nextLine();
                    gerenciador.adicionarContato(nomeAdicionar, telefoneAdicionar);
                    break;

                case 2:
                    gerenciador.listarContatos();
                    break;

                case 3:
                    System.out.print("Nome do Contato a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    gerenciador.removerContato(nomeRemover);
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}