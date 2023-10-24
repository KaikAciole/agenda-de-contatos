import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "agendas=" + contatos +
                '}';
    }

    public void adicionarContato(String nome, String sobrenome, String numero) {
        Contato contato = new Contato(nome, sobrenome, numero);
        contatos.add(contato);
    }

    public String listaContatos() {
        StringBuffer sb = new StringBuffer();

        for (Contato contato : contatos) {
            sb.append(contato.getNome() + " " + contato.getSobrenome() + "\n");
        }
        return sb.toString();
    }

    public Contato selecionarContato(String nome, String sobrenome) {
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome) && c.getSobrenome().equalsIgnoreCase(sobrenome)) {
                return c;
            }
        }
        return null;
    }

    public String exibirContato(String nome, String sobrenome) {
        if (selecionarContato(nome, sobrenome) != null) {
            Contato ctt = selecionarContato(nome, sobrenome);
            return ctt.getNome() + " " + ctt.getSobrenome() + " - " + ctt.getNumero() + ctt.getRelacionamento() + ctt.getAniversario().toString();
        } else {
            return "Esse contato não existe!";
        }
    }

    public void exportaContatos() throws IOException {
        OutputStream fos = new FileOutputStream("agenda.csv");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Nome;Sobrenome;Numero");

        for (Contato contato : contatos) {

            String escreveContato =  contato.getNome() + ";" + contato.getSobrenome() + ";" + contato.getNumero();
            bw.newLine();
            bw.write(escreveContato);
        }

        bw.close();
    }

    public void setRelacionamento(String nome, EnumRelacionamento x) {
        for (Contato contato : contatos) {
            if ((contato.getNome()).equalsIgnoreCase(nome)) {
                contato.setRelacionamento(x);
            }
        }
    }

    public EnumRelacionamento getRelacionamento(String nome, String sobrenome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome) && contato.getSobrenome().equalsIgnoreCase(sobrenome)) {
                return contato.getRelacionamento();
            }
        }
        return null;
    }

    public void setRedeSocial(String nome, EnumTipoContato x) {
        for (Contato contato : contatos) {
            if ((contato.getNome()).equalsIgnoreCase(nome)) {
                contato.setRedeSocial(x);
            }
        }
    }

    public void getRedeSocial(String nome) {
        for (Contato contato : contatos) {
            if ((contato.getNome()).equalsIgnoreCase(nome)) {
                System.out.println(contato.getRedeSocial());
            }
        }
    }

    public void getContatosWhats() {
        for (Contato contato : contatos) {
            if ((contato.getRedeSocial()).equals(EnumTipoContato.WHATSAPP)) {
                System.out.println(contato.getNome());
            }
        }
    }
}
