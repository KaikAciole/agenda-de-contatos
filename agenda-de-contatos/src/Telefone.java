public class Telefone extends Contato{
    private int numero;
    public Telefone(String nome, int numero, FiltroContato filtro) {
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
