import java.io.*;
import java.util.ArrayList;

public class Agenda {

    private final ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionaContato(String nome, String sobrenome, String numero) {
        Contato contato = new Contato(nome, sobrenome, numero);
        contatos.add(contato);
    }

    public String listarContatos() {
        StringBuffer out = new StringBuffer();

        for (Contato contato : contatos) {
            out.append(contato.getNome() + " " + contato.getSobrenome() + ": \n\uD83D\uDCDE " + contato.getNumero() + "\n-------------------\n");
        }
        return out.toString();
    }

    public Contato exibirContato(String nome){
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)){
                return contato;
            }
        }
        return null;
    }

    public void removerContato(String nome){
        for (Contato contato : contatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contatos.remove(contato);
            }
        }
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

    public void setRelacionamento(String nome, Relacionamento relacionamento){
        for (Contato contato : contatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setRelacionamento(relacionamento);
                break;
            }
        }
    }

    public void setRedeSocial(String nome, RedeSocial redeSocial){
        for (Contato contato : contatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setRedeSocial(redeSocial);
                break;
            }
        }
    }

    public void setAniversario(String nome, String aniversario){
        for (Contato contato : contatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setAniversario(aniversario);
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

    public String filtrarRelacionamento(Relacionamento relacionamento2) {
        StringBuffer out = new StringBuffer();

        for (Contato contato : contatos) {
            if (contato.getRelacionamento() != null) {
                if ((contato.getRelacionamento().toString().equals(relacionamento2.toString()))) {
                    out.append(contato.getNome() + " " + contato.getSobrenome() + ": \n\uD83D\uDCDE " + contato.getNumero() + "\n" + contato.relacionamento + "\n-------------------\n");
                }
            }
        }

        return out.toString();
    }

    public String filtrarChamadaDeVideo(){
        StringBuffer out = new StringBuffer();

        for (Contato contato : contatos) {
            if (contato.getRedeSocial() != RedeSocial.TELEFONE) {
                out.append("\n" + contato.getNome() + " " + contato.getSobrenome() + ": \n\uD83D\uDCDE " + contato.getNumero() + "\n" + contato.redeSocial + " - faz chamada de vídeo" + "\n-------------------");
            }
        }
        return out.toString();
    }

    public void exportaContatos() throws IOException {
        OutputStream fos = new FileOutputStream("agenda.csv");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Nome;Sobrenome;Numero;Relacionamento;Endereço;Aniversario;RedeSocial");

        for (Contato contato : contatos) {

            String escreveContato =  contato.getNome() + ";" +  contato.getSobrenome() + ";" + contato.getNumero() + ";" +
                    contato.getRelacionamento() + ";" + contato.getEndereco() + ";" + contato.getAniversario() + ";" + contato.getRedeSocial();
            bw.newLine();
            bw.write(escreveContato);
        }

        bw.close();
    }


}