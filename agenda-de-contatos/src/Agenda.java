import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionaContato(String nome, String sobrenome, String numero) {
        Contato contato = new Contato(nome, sobrenome, numero);
        this.contatos.add(contato);

    }

    public String listaContatos() {
        StringBuffer out = new StringBuffer();

        for(Contato contato : this.contatos){
            out.append(contato);
        }

        return out.toString();
    }

    public void exportaContatos() throws IOException {
        OutputStream fos = new FileOutputStream("agenda.csv");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Nome;Sobrenome;Numero");

        for (Contato contato : this.contatos) {

            String escreveContato =  contato.getNome() + ";" + contato.getSobrenome() + ";" + contato.getNumero();
            bw.newLine();
            bw.write(escreveContato);
        }

        bw.close();
    }
}
