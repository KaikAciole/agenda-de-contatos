public class ContatoComercial extends ContatoBasico {
    String atividade;
    String funcionario;
    String nome;

    public ContatoComercial(String nome, String atividade, String funcionario) {
        super(nome);
        this.atividade = atividade;
        this.funcionario = funcionario;
    }

    public String getDados(){
        String s = super.getDados();
        s+= atividade+"\n"+" contato Sr(a): "+funcionario;
        return s;
    }


}
