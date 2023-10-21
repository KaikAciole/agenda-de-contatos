import java.util.ArrayList;

public class Agenda {
    private ArrayList<ContatoBasico> contatos;
    Agenda(){
        contatos = new ArrayList<>();
    }

    public void inserir(ContatoBasico c){
        contatos.add(c);
    }

}
