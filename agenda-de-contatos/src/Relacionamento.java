public enum Relacionamento {
    A("Colega"),
    B("Família"),
    C("Amigo"),
    D("Inimigo"),
    E("Emergência");

    private String nome;

    Relacionamento(String nome) {
        this.nome = nome;
    }
    public String toString(){
        return this.nome;
    }
}
