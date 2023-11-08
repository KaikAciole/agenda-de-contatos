package domain;

import java.io.IOException;
import java.util.Scanner;

public class AgendaMain {

    public static void main(String[] args) throws IOException {
        Agenda agenda = new Agenda();

        Scanner scanner = new Scanner(System.in);
        String escolha = " ";
        while (!escolha.equals("H")) {
            escolha = menu(scanner);
            comando(escolha, agenda, scanner);
        }
    }

    private static String menu(Scanner scanner) {
        System.out.print(
                "\nMENU\n" +
                        "(A)Adicionar Contato\n" +
                        "(B)Listar Contatos\n" +
                        "(C)Exibir Contato\n" +
                        "(D)Remover Contato\n" +
                        "(E)Exportar CSV\n" +
                        "(F)Editar Contato\n"+
                        "(G)Filtrar\n" +
                        "(H)Sair\n"+
                        "\n"+
                        "Opção: ");
        return scanner.next().toUpperCase();
    }

    private static void comando(String opcao, Agenda agenda, Scanner scanner) throws IOException {
        switch (opcao) {
            case "A":
                adicionarContato(agenda, scanner);
                break;
            case "B":
                listarContatos(agenda);
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
            case "G":
                filtrar(agenda, scanner);
                break;
            case "H":
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

        agenda.adicionaContato(nome, sobrenome, numero);
        System.out.println("CONTATO ADICIONADO ✅");
    }

    private static void listarContatos(Agenda agenda) {
        System.out.println(agenda.listarContatos());
    }

    private static void exportaContatos(Agenda agenda) throws IOException {
        //agenda.exportaContatos();
        System.out.println("Contatos exportados ✅");
    }

    private static void exibirContato(Agenda agenda, Scanner scanner) {
        System.out.print("Qual contato: ");
        String nome = scanner.next();
        System.out.println("Detalhes de " + nome);
        System.out.print(agenda.exibirContato(nome));
    }

    private static void removerContato(Agenda agenda, Scanner scanner) {
        System.out.print("Qual contato: ");
        String nome = scanner.next();
        System.out.println("Domain.Contato " + nome + " removido com sucesso!");
        agenda.removerContato(nome);
    }

    private static void filtrar(Agenda agenda, Scanner scanner) {
        System.out.println("Qual tipo de contato deseja filtrar: ");
        System.out.print("'A'-Tipo de relacionamento 'B'-Chamada de video: ");
        String opcao = scanner.next().toUpperCase();
        if(opcao.equalsIgnoreCase("A")){
            System.out.println("'A'-Colega, 'B'-Familia, 'C'-Amigo, 'D'-Inimigo, 'E'-Emergência: ");
            String relacionamento = scanner.next().toUpperCase();
            System.out.println(agenda.filtrarRelacionamento(Relacionamento.valueOf(relacionamento)));

        } else if (opcao.equalsIgnoreCase("B")) {
            System.out.println(agenda.filtrarChamadaDeVideo());
    }
    }

    private static void editar (Agenda agenda, Scanner scanner) {
        System.out.println("Digite o nome do contato você quer editar: ");
        String nome = scanner.next();

        while (true) {
            System.out.println("O que você quer editar: 'A'-Nome 'B'-Sobrenome 'C'-Numero 'D'-Aniversário 'E'-Endereço 'F'-Domain.Relacionamento 'G'-Rede Social");
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

            } else if (opc.equalsIgnoreCase("C")) {
                System.out.println("Qual número você quer definir para este contato? ");
                String numeroMudado = scanner.next();
                agenda.setNumero(nome, numeroMudado);

            } else if (opc.equalsIgnoreCase("D")) {
                System.out.println("Qual data de aniversário quer definir para este contato? (formato: dd/mm/yyyy): ");
                String data = scanner.next();
                agenda.setAniversario(nome, data);

            } else if (opc.equalsIgnoreCase("E")) {
                System.out.println("Adicione ou mude o endereço: ");
                scanner.nextLine();
                String endereco = scanner.nextLine();
                agenda.setEndereco(nome, endereco);

            } else if (opc.equalsIgnoreCase("F")) {
                System.out.println("Qual tipo de relacionamento você que definir a este contato: ");
                System.out.print("'A'-Colega, 'B'-Familia, 'C'-Amigo, 'D'-Inimigo, 'E'-Emergência: \n");
                String relacionamento = scanner.next().toUpperCase();
                if(relacionamento.equalsIgnoreCase("a")){
                    agenda.setRelacionamento(nome, Relacionamento.COLEGA);
                } else if (relacionamento.equalsIgnoreCase("b")) {
                    agenda.setRelacionamento(nome, Relacionamento.FAMILIA);
                }else if (relacionamento.equalsIgnoreCase("c")) {
                    agenda.setRelacionamento(nome, Relacionamento.AMIGO);
                }else if (relacionamento.equalsIgnoreCase("d")) {
                    agenda.setRelacionamento(nome, Relacionamento.INIMIGO);
                }else if (relacionamento.equalsIgnoreCase("e")) {
                    agenda.setRelacionamento(nome, Relacionamento.EMERGENCIA);
                }

            } else if (opc.equalsIgnoreCase("G")) {
                System.out.println("Qual rede social quer definir ao contato:  ");
                System.out.println("'A'-Whatsapp, 'B'-Telegram, 'C'-Telefone: ");
                String redeSocial = scanner.next().toUpperCase();
                if (redeSocial.equalsIgnoreCase("a")){
                    agenda.setRedeSocial(nome, RedeSocial.WHATSAPP);
                }else if(redeSocial.equalsIgnoreCase("b")){
                    agenda.setRedeSocial(nome, RedeSocial.TELEGRAM);
                }else if(redeSocial.equalsIgnoreCase("c")){
                    agenda.setRedeSocial(nome, RedeSocial.TELEFONE);
                }

            }
            System.out.println("Deseja continuar editando? S/N");
            String opcao = scanner.next();
            if (opcao.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}

