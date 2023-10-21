import java.util.ArrayList;
import java.util.List;

public class AgendaController {

    private List<Agenda> agendas;

    public AgendaController() {
        this.agendas = new ArrayList<>();
    }

    public void cadastraAgenda(String nome, String sobrenome, String numero) {
        Agenda agenda = new Agenda(nome, sobrenome, numero);
        agendas.add(agenda);
    }

    public String listaContatos() {
        StringBuffer out = new StringBuffer();

        for(Agenda agenda : agendas){
            out.append(agenda);
        }

        return out.toString();
    }
}
