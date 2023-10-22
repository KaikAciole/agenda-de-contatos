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
                "agendas=" + agendas +
                '}';
    }

    public void adicionarContato(String nome, String sobrenome, String numero) {
        Contato contato = new Contato(nome.toLowerCase(), sobrenome, numero);
        agendas.add(contato);

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

    public void setRelacionamento(String nome, EnumRelacionamento x){
        for (Contato contato : agendas) {
            if((contato.getNome()).equalsIgnoreCase(nome)){
                contato.setRelacionamento(x);
            }
        }

    }

    public void getRelacionamento(String nome){
        for (Contato contato : agendas) {
            if((contato.getNome()).equalsIgnoreCase(nome)){
                System.out.println(contato.getRelacionamento());
            }
        }
    }public void setRedeSocial(String nome, EnumTipoContato x){
        for (Contato contato : agendas) {
            if((contato.getNome()).equalsIgnoreCase(nome)){
                contato.setRedeSocial(x);
            }
        }

    }

    public void getRedeSocial(String nome){
        for (Contato contato : agendas) {
            if((contato.getNome()).equalsIgnoreCase(nome)){
                System.out.println(contato.getRedeSocial());
            }
        }
    }

    public void getContatosWhats(){
        for (Contato contato : agendas) {
            if((contato.getRedeSocial()).equals(EnumTipoContato.WHATSAPP)){
                System.out.println(contato.getNome());
            }
        }
    }

    public static void main(String[] args) {
        Agenda agenda1 = new Agenda();
        agenda1.adicionarContato("zezo", "chico", "83921312832");
        agenda1.adicionarContato("zefa", "chica", "12832");
        agenda1.adicionarContato("jose", "viv", "1283132");
        agenda1.setRedeSocial("ZeZo", EnumTipoContato.WHATSAPP);
        agenda1.setRedeSocial("Zefa", EnumTipoContato.WHATSAPP);
        agenda1.setRedeSocial("josE", EnumTipoContato.WHATSAPP);
        agenda1.getContatosWhats();

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
