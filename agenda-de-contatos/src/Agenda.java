import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> agendas;

    public Agenda() {
        this.agendas = new ArrayList<>();
    }

    public void adicionarContato(String nome, String sobrenome, String numero) {
        Contato contato = new Contato(nome, sobrenome, numero);
        agendas.add(contato);
    }

    public String listaContatos() {
        StringBuffer out = new StringBuffer();

        for(Contato contato : agendas){
            out.append(contato);
        }

        return out.toString();
    }
}
