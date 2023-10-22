import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> agendas;

    public Agenda() {
        this.agendas = new ArrayList<>();
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
    }

    public String listaContatos() {
        StringBuffer out = new StringBuffer();

        for(Contato contato : agendas){
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
}
