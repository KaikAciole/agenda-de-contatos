public enum RedeSocial {
    WHATSAPP("Whatsapp"),
    TELEGRAM("Telegram"),
    TELEFONE("Telefone"),
    Ninfo("❌ Não informado");
    private final String nome;

    RedeSocial(String nome) {
        this.nome = nome;
    }
    public String toString(){
        return this.nome;
    }
}
