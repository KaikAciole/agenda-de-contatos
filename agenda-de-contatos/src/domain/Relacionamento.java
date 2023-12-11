package domain;

public enum Relacionamento {
    COLEGA("Colega"),
    FAMILIA("Familia"),
    AMIGO("Amigo"),
    INIMIGO("Inimigo"),
    EMERGENCIA("Emergencia"),
    INDEFINIDO("Indefinido");


    private final String nome;

    Relacionamento(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return this.nome;
    }
}