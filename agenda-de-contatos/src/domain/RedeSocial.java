package domain;

public enum RedeSocial {
    WHATSAPP("Whatsapp"),
    TELEGRAM("Telegram"),
    TELEFONE("Telefone");

    private final String nome;

    RedeSocial(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return this.nome;
    }
}
