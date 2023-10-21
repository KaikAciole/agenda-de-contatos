import java.util.ArrayList;

public abstract class ContatoBasico {
    protected String nome;
    protected ArrayList<Telefone> telefones;

    public ContatoBasico(String nome) {
        this.nome = nome;
        this.telefones = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(Telefone telefonet) {
        telefones.add(telefonet);
    }

    public String getDados(){
        String x = nome + "\n";
        for (Telefone telefone : telefones) {
            x += telefone.getTelefone()+"\n";
        }

        return x;
    }
}
