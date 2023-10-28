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
                "\nMENU\n" +
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
                adicionarContato(agenda, scanner);
                break;
            case "B":
                listaContatos(agenda);
                break;
            case "C":
                exibirContato(agenda, scanner);
                break;
            case "D":
                removerContato(agenda, scanner);
                break;
            case "E":
                exportaContatos(agenda);
                break;
            case "F":
                editar(agenda, scanner);
                break;
            default:
                System.out.println("Opção inválida!");
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

    private static void editar(Agenda agenda, Scanner scanner) {
        System.out.println("Digite o nome do contato você quer editar: ");
        String nome = scanner.next();

        while (true) {
            System.out.println("O que você quer editar: 'A'-Nome 'B'-Sobrenome 'C'-Aniversário 'D'-Endereço 'E'-Relacionamento 'F'-Rede Social");
            String opc = scanner.next();

            if (opc.equalsIgnoreCase("A")) {
                System.out.println("Por qual nome você quer substituir? ");
                String nomeMudado = scanner.next();
                agenda.setNome(nome, nomeMudado);
                nome = nomeMudado;

            } else if (opc.equalsIgnoreCase("B")) {
                System.out.println("Qual sobrenome você quer definir a este contato? ");
                String sobrenomeMudado = scanner.next();
                agenda.setSobrenome(nome, sobrenomeMudado);

//            }else if (opc.equalsIgnoreCase("C")){
//                System.out.println("Qual data de aniversário quer definir para este contato? ");
//                String[] data = scanner.next().split("/");
//                int i = 0;
//                String mes = "";
//                for (String j : data) {
//                    if(i == 1){
//                        mes = j;
//                    }
//                    i++;
//                }
//                System.out.println(mes);

            }else if (opc.equalsIgnoreCase("D")) {
                System.out.println("Adicione ou mude o endereço");
                String endereco = scanner.nextLine();
                agenda.setEndereco(nome, endereco);


            } else if (opc.equalsIgnoreCase("E")) {
                System.out.println("Qual tipo de relacionamento você que definir a este contato: ");
                System.out.print("'A'-Colega, 'B'-Familia, 'C'-Amigo, 'D'-Inimigo, 'E'-Emergência: ");
                String relacionamento = scanner.next();
                agenda.setRelacionamento(nome, Relacionamento.valueOf(relacionamento));

            } else if (opc.equalsIgnoreCase("F")) {
                System.out.println("Qual rede social quer definir ao contato:  ");
                System.out.println("'A'-Whatsapp, 'B'-Telegram, 'C'-Telefone: ");
                String redeSocial = scanner.next().toUpperCase();
                agenda.setRedeSocial(nome, RedeSocial.valueOf(redeSocial));
            }
            System.out.println("Deseja continuar editando?\n S/N");
            String opcao = scanner.next();
            if(opcao.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}