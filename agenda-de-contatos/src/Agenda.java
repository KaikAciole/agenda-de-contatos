import java.io.*;
import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionaContato(String nome, String sobrenome, String numero) {
        Contato contato = new Contato(nome, sobrenome, numero);
        contatos.add(contato);
    }

    public String listaContatos() {
        StringBuffer out = new StringBuffer();

        for (Contato x : contatos) {
            out.append(x.getNome() + " " + x.getSobrenome() + ": \n\uD83D\uDCDE " + x.getNumero() + "\n-------------------\n");
        }
        return out.toString();
    }

    public String exibirContato(String nome){
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)){
                return contato.toString();
            }
        }
        return "Não informado";
    }
    public boolean removerContato(String nome){
        for (Contato contato : contatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                return contatos.remove(contato);
            }
        }
        return false;
    }

    public void setNome(String nome, String nomeMudado){
        for (Contato contato : contatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNome(nomeMudado);
                break;
            }
        }
    }

    public void setSobrenome(String nome, String sobrenome){
        for (Contato contato : contatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setSobrenome(sobrenome);
                break;
            }
        }
    }

    public void setNumero(String nome, String numero){
        for (Contato contato : contatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(numero);
                break;
            }
        }
    }

    public void setRelacionamento(String nome, Relacionamento x){
        for (Contato contato : contatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setRelacionamento(x);
                break;
            }
        }
    }

    public void setRedeSocial(String nome, RedeSocial x){
        for (Contato contato : contatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setRedeSocial(x);
                break;
            }
        }
    }

    public void setAniversario(String nome, String x){
        for (Contato contato : contatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setAniversario(x);
                break;
            }
        }
    }

    public void setEndereco(String nome,  String endereco){
        for (Contato contato : contatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setEndereco(endereco);
                break;
            }
        }
    }

    public void exportaContatos() throws IOException {
        OutputStream fos = new FileOutputStream("agenda.csv");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Nome;Sobrenome;Numero;Relacionamento;Endereço;Aniversario;Rede social");

        for (Contato contato : contatos) {

            String escreveContato =  contato.getNome() + ";" +  contato.getSobrenome() + ";" + contato.getNumero() + ";" +
                    contato.getRelacionamento() + ";" + contato.getEndereco() + ";" + contato.getAniversario() + ";" + contato.getRedeSocial();
            bw.newLine();
            bw.write(escreveContato);
        }

        bw.close();
    }


}