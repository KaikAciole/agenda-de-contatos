package domain;

public class Contato {
    private String nome;
    private String sobrenome;
    private String numero;
    Relacionamento relacionamento = Relacionamento.INDEFINIDO;
    RedeSocial redeSocial = RedeSocial.TELEFONE;
    private String aniversario;
    private String endereco = "";

    public Contato(String nome, String sobrenome, String numero) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numero = numero;

    }

    public Contato(String nome, String sobrenome, String numero, Relacionamento relacionamento) {
        this(nome, sobrenome, numero);
        this.relacionamento = relacionamento;
    }

    public Contato(String nome, String sobrenome, String numero, Relacionamento relacionamento, RedeSocial redeSocial) {
        this(nome, sobrenome, numero, relacionamento);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Relacionamento getRelacionamento() {
        return relacionamento;
    }

    public void setRelacionamento(Relacionamento relacionamento) {
        this.relacionamento = relacionamento;
    }

    public RedeSocial getRedeSocial() {
        return redeSocial;
    }

    public void setRedeSocial(RedeSocial redeSocial) {
        this.redeSocial = redeSocial;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = String.valueOf(aniversario);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "-------------------------" + "\n" +
                "nome: " + nome + "\n" +
                "sobrenome: " + sobrenome + "\n" +
                "numero: " + numero + "\n" +
                "relacionamento: " + relacionamento + "\n" +
                "redeSocial: " + redeSocial + "\n" +
                "aniversario: " + aniversario + "\n" +
                "endereco: " + endereco + "\n" +
                "-------------------------";
    }
}