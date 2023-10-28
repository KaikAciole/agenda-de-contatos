import java.io.IOException;
import java.util.Scanner;

public class AgendaMain {

    public static void main(String[] args) throws IOException {
        Agenda agenda = new Agenda();

        Scanner scanner = new Scanner(System.in);
        String escolha;
        while (true) {
            escolha = menu(scanner);
            comando(escolha, agenda, scanner);
        }
    }

    private static String menu(Scanner scanner) {
        System.out.print(
                """

                        ---
                        MENU
                        (A)Adicionar Contato
                        (B)listar Contatos
                        (C)exibir Contato
                        (D)remover Contato
                        (E)Exportar CSV
                        (F)Editar Contato
                        (G)sair

                        Opção:\s""");
        return scanner.next().toUpperCase();
    }

    private static void comando(String opcao, Agenda agenda, Scanner scanner) throws IOException {
        switch (opcao) {
            case "A" -> adicionarContato(agenda, scanner);
            case "B" -> listaContatos(agenda);
            case "C" -> exibirContato(agenda, scanner);
            case "D" -> removerContato(agenda, scanner);
            case "E" -> exportaContatos(agenda);
            case "F" -> editar(agenda, scanner);

            default -> System.out.println("Opção inválida!");
        }
    }

    private static void adicionarContato(Agenda agenda, Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Sobrenome: ");
        String sobrenome = scanner.next();
        System.out.print("Número: ");
        String numero = scanner.next();

        agenda.adicionaContato(nome, sobrenome, numero );
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

    private static void editar(Agenda agenda, Scanner scanner){
        System.out.println("Qual contatato você quer editar: ");
        String nome = scanner.next();

        System.out.println("Oque você quer editar: Nome'A' Sobrenome'B' Relacionamento'C 'Endereço'D' ");
        String opc = scanner.next();

        if (opc.equalsIgnoreCase("A")) {
            System.out.println("Por qual nome quer substituir? ");
            String nomeMudado = scanner.next();
            agenda.setNome(nome, nomeMudado);
        } else if (opc.equalsIgnoreCase("B")) {
            System.out.println("Por qual sobrenome quer substituir? ");
            String sobrenoMudado = scanner.next();
            agenda.setSobrenome(nome, sobrenoMudado);
        } else if (opc.equalsIgnoreCase("c")) {
            System.out.println("Para qual tipo de relacionamento deseja substituir: ");
            System.out.print("'A'-Colega, 'B'-Familia, 'C'-Amigo, 'D'-Inimigo, 'E'-Emergência: ");
            String relacionamento = scanner.next().toUpperCase();
            agenda.setRelacionamento(nome, Relacionamento.valueOf(relacionamento));
        } else if (opc.equalsIgnoreCase("D")) {
            System.out.println("Adicione ou mude o endereço");
            String endereco = scanner.next();
            agenda.setEndereco(nome, endereco);
        }
    }


}