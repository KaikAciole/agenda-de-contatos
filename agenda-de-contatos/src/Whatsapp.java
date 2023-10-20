public class Whatsapp extends Contato{
    private String status;

    public Whatsapp(String nome, String status, FiltroContato filtro) {
        super(nome);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
