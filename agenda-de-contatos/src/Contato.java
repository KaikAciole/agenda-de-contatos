import java.util.ArrayList;

public class Contato {
    private String nome;
    private ArrayList<Contato> contatos = new ArrayList<>();

    public Contato(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
