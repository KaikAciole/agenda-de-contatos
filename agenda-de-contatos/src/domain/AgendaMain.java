package domain;

import Validators.NumberValidator;
import Validators.Validator;

import java.io.IOException;
import java.util.Scanner;

public class AgendaMain {

    public static void main(String[] args) throws IOException {
        Agenda agenda = new Agenda();

        Scanner scanner = new Scanner(System.in);
        int escolha = 8;
        while (escolha != 0) {
            escolha = menu(scanner);
            comando(escolha, agenda, scanner);
        }
    }

    private static int menu(Scanner scanner) {
        System.out.print(
                "\nMENU\n" +
                        "1 - Adicionar Contato\n" +
                        "2 - Listar Contatos\n" +
                        "3 - Exibir Contato\n" +
                        "4 - Remover Contato\n" +
                        "5 - Exportar CSV\n" +
                        "6 - Editar Contato\n"+
                        "7 - Filtrar\n" +
                        "0 - Sair\n"+
                        "\n"+
                        "Opção: ");
        return scanner.nextInt();
    }

    private static void comando(int opcao, Agenda agenda, Scanner scanner) throws IOException {
        switch (opcao) {
            case 1:
                adicionarContato(agenda, scanner);
                break;
            case 2:
                listarContatos(agenda);
                break;
            case 3:
                exibirContato(agenda, scanner);
                break;
            case 4:
                removerContato(agenda, scanner);
                break;
            case 5:
                exportaContatos(agenda);
                break;
            case 6:
                editar(agenda, scanner);
                break;
            case 7:
                filtrar(agenda, scanner);
                break;
            case 0:
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void adicionarContato(Agenda agenda, Scanner scanner) {
        Validator<String> validator = new NumberValidator(true);

        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Sobrenome: ");
        String sobrenome = scanner.next();

        String numero = validator.getValidValue("Número: ", "Número inválido ou já cadastrado (formato: (xx)xxxxx-xxxx", String.class);

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
        Contato c1 = agenda.exibirContato(nome).get(0);
        System.out.println("Detalhes de " + c1.getNome());
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
        Contato c1 = agenda.exibirContato(nome).get(0);
        System.out.println("Editando o contato: " + c1.getNome() + " " + c1.getSobrenome());

        while (true) {
            System.out.println("O que você quer editar: 1-Nome 2-Sobrenome 3-Numero 4-Aniversário 5-Endereço 6-Relacionamento 7-Rede Social");
            int opc = scanner.nextInt();

            if (opc == 1) {
                System.out.println("Por qual nome você quer substituir? ");
                String nomeMudado = scanner.next();
                agenda.setNome(nome, nomeMudado);
                nome = nomeMudado;

            } else if (opc == 2) {
                System.out.println("Qual sobrenome você quer definir a este contato? ");
                String sobrenomeMudado = scanner.next();
                agenda.setSobrenome(nome, sobrenomeMudado);

            } else if (opc == 3) {
                System.out.println("Qual número você quer definir para este contato? ");
                String numeroMudado = scanner.next();
                agenda.setNumero(nome, numeroMudado);

            } else if (opc == 4) {
                System.out.println("Qual data de aniversário quer definir para este contato? (formato: dd/mm/yyyy): ");
                String data = scanner.next();
                agenda.setAniversario(nome, data);

            } else if (opc == 5) {
                System.out.println("Adicione ou mude o endereço: ");
                scanner.nextLine();
                String endereco = scanner.nextLine();
                agenda.setEndereco(nome, endereco);

            } else if (opc == 6) {
                System.out.println("Qual tipo de relacionamento você que definir a este contato: ");
                System.out.print("1-Colega, 2-Familia, 3-Amigo, 4-Inimigo, 5-Emergência: \n");
                int relacionamento = scanner.nextInt();
                if(relacionamento == 1){
                    agenda.setRelacionamento(nome, Relacionamento.COLEGA);
                } else if (relacionamento == 2) {
                    agenda.setRelacionamento(nome, Relacionamento.FAMILIA);
                }else if (relacionamento == 3) {
                    agenda.setRelacionamento(nome, Relacionamento.AMIGO);
                }else if (relacionamento == 4) {
                    agenda.setRelacionamento(nome, Relacionamento.INIMIGO);
                }else if (relacionamento == 5) {
                    agenda.setRelacionamento(nome, Relacionamento.EMERGENCIA);
                }

            } else if (opc == 7) {
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
            System.out.println("Deseja continuar editando?\n 1 - Sim 2 - Não");
            int opcao = scanner.nextInt();
            if (opcao == 2) {
                break;
            }
        }
    }
}

