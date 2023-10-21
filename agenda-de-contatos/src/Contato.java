import java.util.Calendar;
import java.util.GregorianCalendar;

public class Contato extends ContatoBasico {
    protected Calendar dtNascimento;

    public Contato(String nome, Calendar dtNascimento) {
        super(nome);
        this.dtNascimento = dtNascimento;
    }

    @Override
    public String getDados(){
        return super.getDados()+"Nascido em "+
                dtNascimento.get(Calendar.DATE)+"/"+
                dtNascimento.get(Calendar.MONTH)+"/"+
                dtNascimento.get(Calendar.YEAR)+"/"+ "\nIdade: ";
    }

    public int getIdade(){
        Calendar hoje = new GregorianCalendar();
        int idade = hoje.get(Calendar.YEAR)-dtNascimento.get(Calendar.YEAR);
        hoje.set(Calendar.YEAR, dtNascimento.get(Calendar.YEAR));
        if(hoje.before(dtNascimento)){
            idade--;
            return idade;
        }
        return idade;
    }
}
