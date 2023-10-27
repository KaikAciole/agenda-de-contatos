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
                        "(A)Adicionar Contato\n" +
                        "(B)listar Contatos\n" +
                        "(C)exibir Contato\n" +
                        "(D)remover Contato\n" +
                        "(E)Exportar CSV\n" +
                        "(F)Editar Contato\n"+
                        "(G)sair\n" +
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
            case "C":
                exibirContato(agenda, scanner);
                break;
            case "D":
                removerContato(agenda, scanner);
                break;
            case "F":
                setNome(agenda, scanner);
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
        System.out.print("Relacionamento:\n'A'-Colega, 'B'-Familia, 'C'-Amigo, 'D'-Inimigo, 'E'-Emergência: ");
        String relacionamento = scanner.next().toUpperCase();

        agenda.adicionaContato(nome, sobrenome, numero , Relacionamento.valueOf(relacionamento));
        System.out.println("CONTATO ADICIONADO ✅");
    }

    private static void listaContatos(Agenda agenda) {
        System.out.println(agenda.listaContatos());
    }

    private static void exportaContatos(Agenda agenda) throws IOException {
        agenda.exportaContatos();
        System.out.println("Contatos exportados ✅");
    }
    private static void exibirContato(Agenda agenda, Scanner scanner){
        System.out.print("Qual contato: ");
        String nome = scanner.next();
        System.out.println("Detalhes de " + nome);
        System.out.print(agenda.exibirContato(nome));
        //settar metodos não obrigatorios aqui
    }
    private static void removerContato(Agenda agenda, Scanner scanner){
        System.out.print("Qual contato: ");
        String nome = scanner.next();
        System.out.println("Contato " + nome + " removido com sucesso!");
        System.out.print(agenda.removerContato(nome));
    }

    private static void setNome(Agenda agenda, Scanner scanner){
        System.out.println("Qual nome você quer mudar? ");
        String nome = scanner.next();
        System.out.println("Por qual nome quer substituir?");
        String nomeMudado = scanner.next();
        agenda.setNome(nome, nomeMudado);
    }


}