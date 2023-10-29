public enum RedeSocial {
    A("Whatsapp"),
    B("Telegram"),
    C("Telefone"),
    Ninfo("❌ Não informado");
    private final String nome;

    RedeSocial(String nome) {
        this.nome = nome;
    }
    public String toString(){
        return this.nome;
    }
}
