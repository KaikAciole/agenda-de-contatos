import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Agenda {

    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionaContato(String nome, String sobrenome, String numero, Relacionamento relacionamento) {
        Contato contato = new Contato(nome, sobrenome, numero, relacionamento);
        this.contatos.add(contato);
    }

    public String listaContatos() {
        StringBuffer out = new StringBuffer();

        int i = 0;
        for (int j=0; j<this.contatos.size(); j++) {
            Contato x = this.contatos.get(j);
            if (i == 0) {
                out.append(x.toString());
            } else {
                out.append("\n").append(x.toString());
            }
            i++;
        }
        return out.toString();
    }
    public String exibirContato(String nome){
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)){
                return contato.toString();
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
            }
        }
    }

    public void setSobrenome(String nome, String sobrenome){
        for (Contato contato : contatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setSobrenome(sobrenome);
            }
        }
    }

    public void setNumero(String nome, String numero){
        for (Contato contato : contatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(numero);
            }
        }
    }

    public void setRelacionamento(String nome, Relacionamento x){
        for (Contato contato : contatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setRelacionamento(x);
            }
        }
    }

    public void setRedeSocial(String nome, RedeSocial x){
        for (Contato contato : contatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setRedeSocial(x);
            }
        }
    }

    public void setAniversario(){

    }

    public void setEndereco(){

    }

    public void exportaContatos() throws IOException {
        OutputStream fos = new FileOutputStream("agenda.csv");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);


        bw.write("Nome;Sobrenome;Numero;Relacionamento");

        for (Contato contato : this.contatos.values()) {

            String escreveContato = contato.getNome() + ";" + contato.getSobrenome() + ";" + contato.getNumero() + ";" + contato.relacionamento;
            bw.newLine();
            bw.write(escreveContato);
        }

        bw.close();
    }


}
