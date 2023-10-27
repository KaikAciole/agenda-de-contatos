public enum Relacionamento {
    COLEGA("Colega"),
    FAMILIA("Família"),
    AMIGO("Amigo"),
    INIMIGO("Inimigo"),
    EMERGENCIA("Emergência");

    private String nome;

    Relacionamento(String nome) {
        this.nome = nome;
    }
    public String toString(){
        return this.nome;
    }
}
