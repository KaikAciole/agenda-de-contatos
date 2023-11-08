package domain;

public enum Relacionamento {
    COLEGA("Colega"),
    FAMILIA("Família"),
    AMIGO("Amigo"),
    INIMIGO("Inimigo"),
    EMERGENCIA("Emergência"),
    INDEFINIDO("Indefinido");


    private final String nome;

    Relacionamento(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return this.nome;
    }
}