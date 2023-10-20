public class Email extends Contato{
    public enum TipoEmail{
        ACADEMICO, PESSOAL, PROFISSIONAL;

    }

    private TipoEmail tipo;

    public Email(String nome, TipoEmail tipo) {
        super(nome);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Email{" +
                "tipo=" + tipo +
                '}';
    }

    public TipoEmail getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmail tipo) {
        this.tipo = tipo;
    }
}
