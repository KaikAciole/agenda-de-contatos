import java.util.Scanner;

public class AgendaMain {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Scanner scanner = new Scanner(System.in);
        String escolha = "";
        while (true) {
            escolha = menu(scanner);
            comando(escolha, agenda, scanner);
        }
    }

    private static String menu(Scanner scanner) {
        System.out.print(
                "\n---\nMENU\n" +
                        "(A)Cadastrar Contato\n" +
                        "(B)Listar Contatos\n" +
                        "(C)Exibir Contato\n" +
                        "(D)Remover Contato\n" +
                        "(E)Exportar CSV\n" +
                        "(F)Sair\n" +
                        "\n" +
                        "Opção> ");
        return scanner.next().toUpperCase();
    }

    private static void comando(String opcao, Agenda agenda, Scanner scanner) {
        switch (opcao) {
            case "A":
                cadastraContato(agenda, scanner);
                break;
            case "B":
                listaContatos(agenda);
                break;
            default:
                System.out.println("Opção inválida!");
        }

    }

    private static void cadastraContato(Agenda agenda, Scanner scanner) {
        System.out.print("\nNome: ");
        String nome = scanner.next();
        System.out.print("\nSobrenome: ");
        String sobrenome = scanner.next();
        System.out.print("\nNúmero: ");
        String numero = scanner.next();

        agenda.adicionarContato(nome, sobrenome, numero);
    }

    private static void listaContatos(Agenda agenda) {
        System.out.println(agenda.listaContatos());
    }
}