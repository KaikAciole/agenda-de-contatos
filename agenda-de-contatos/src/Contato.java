import java.util.Date;

public class Contato {
    private String nome;
    private String sobrenome;
    private String numero;
    EnumRelacionamento relacionamento;
    EnumTipoContato redeSocial;
    private Date aniversario;
    private String endereco;

    public Contato(String nome, String sobrenome, String numero){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numero = numero;
    }


    public Contato(String nome, String sobrenome, String numero, EnumRelacionamento relacionamento) {
        this(nome, sobrenome, numero);
        this.relacionamento = relacionamento;
    }

    public Contato(String nome, String sobrenome, String numero, EnumRelacionamento relacionamento, EnumTipoContato redeSocial){
        this(nome, sobrenome, numero, relacionamento);
        this.redeSocial = redeSocial;
    }

    public void mostrarContato() {
        System.out.println(this.nome);
        System.out.println(this.numero);
        System.out.println(this.relacionamento);
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

    //public EnumRelacionamento getRelacionamento() {
        //return relacionamento;
    //}

    //public void setRelacionamento(EnumRelacionamento relacionamento) {
        //this.relacionamento = relacionamento;
    //}

    public Date getAniversario() {
        return aniversario;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void cadastraContato(int posicao, String nome, String sobrenome, String telefone) {
    }

  }
