public class Telefone extends Contato{
    private int numero;
    public Telefone(String nome, int numero) {
        super(nome);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
