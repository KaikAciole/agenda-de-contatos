import java.io.IOException;
import java.util.Scanner;

public class AgendaMain {

    public static void main(String[] args) throws IOException {
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
                        "(B)listar Contatos\n" +
                        "(C)exibir Contato\n" +
                        "(D)remover Contato\n" +
                        "(E)Exportar CSV\n" +
                        "(F)sair\n" +
                        "\n" +
                        "Opção: ");
        return scanner.next().toUpperCase();
    }

    private static void comando(String opcao, Agenda agenda, Scanner scanner) throws IOException {
        switch (opcao) {
            case "A":
                adicionaContato(agenda, scanner);
                break;
            case "B":
                listaContatos(agenda);
                break;
            case "E":
                exportaContatos(agenda);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void adicionaContato(Agenda agenda, Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Sobrenome: ");
        String sobrenome = scanner.next();
        System.out.print("Número: ");
        String numero = scanner.next();

        agenda.adicionaContato(nome, sobrenome, numero);
    }

    private static void listaContatos(Agenda agenda) {
        System.out.println(agenda.listaContatos());
    }

    private static void exportaContatos(Agenda agenda) throws IOException {
        agenda.exportaContatos();
        System.out.println("");
    }
}