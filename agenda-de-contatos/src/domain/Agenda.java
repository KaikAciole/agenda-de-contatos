package domain;

import repository.CSVDataService;
import repository.ContatoRepository;


public class Agenda {

    private ContatoRepository repository;

    public Agenda() {
        repository = ContatoRepository.getInstance();
        repository.setRepository(new CSVDataService());
    }

    public void adicionaContato(String nome, String sobrenome, String numero) {
        Contato contato = new Contato(nome, sobrenome, numero);
        repository.add(contato);
    }

    public String listarContatos() {
        StringBuffer out = new StringBuffer();

        for (Contato contato : repository.getAll()) {
            out.append(contato.getNome() + " " + contato.getSobrenome() + ": \n\uD83D\uDCDE " + contato.getNumero() + "\n-------------------\n");
        }
        return out.toString();
    }

    public Contato exibirContato(String nome){
        for (Contato contato : repository.getAll()) {
            if (contato.getNome().equalsIgnoreCase(nome)){
                return contato;
            }
        }
        return null;
    }

    public void removerContato(String nome){
        for (Contato contato : repository.getAll()) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                repository.remove(contato);
            }
        }
    }

    public void setNome(String nome, String nomeMudado){
        for (Contato contato : repository.getAll()) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNome(nomeMudado);
                break;
            }
        }
    }

    public void setSobrenome(String nome, String sobrenome){
        for (Contato contato : repository.getAll()) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setSobrenome(sobrenome);
                break;
            }
        }
    }

    public void setNumero(String nome, String numero){
        for (Contato contato : repository.getAll()) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(numero);
                break;
            }
        }
    }

    public void setRelacionamento(String nome, Relacionamento relacionamento){
        for (Contato contato : repository.getAll()) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setRelacionamento(relacionamento);
                break;
            }
        }
    }

    public void setRedeSocial(String nome, RedeSocial redeSocial){
        for (Contato contato : repository.getAll()) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setRedeSocial(redeSocial);
                break;
            }
        }
    }

    public void setAniversario(String nome, String aniversario){
        for (Contato contato : repository.getAll()) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setAniversario(aniversario);
                break;
            }
        }
    }

    public void setEndereco(String nome,  String endereco){
        for (Contato contato : repository.getAll()) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setEndereco(endereco);
                break;
            }
        }
    }

    public String filtrarRelacionamento(Relacionamento relacionamento2) {
        StringBuffer out = new StringBuffer();

        for (Contato contato : repository.getAll()) {
            if (contato.getRelacionamento() != null) {
                if ((contato.getRelacionamento().toString().equals(relacionamento2.toString()))) {
                    out.append(contato.getNome() + " " + contato.getSobrenome() + ": \n\uD83D\uDCDE " + contato.getNumero() +
                            "\n" + contato.relacionamento + "\n-------------------\n");
                }
            }
        }

        return out.toString();
    }

    public String filtrarChamadaDeVideo(){
        StringBuffer out = new StringBuffer();


        for (Contato contato : repository.getAll()) {
            if (contato.getRedeSocial() != RedeSocial.TELEFONE) {
                out.append("\n" + contato.getNome() + " " + contato.getSobrenome() + ": \n\uD83D\uDCDE " + contato.getNumero() + "\n" + contato.redeSocial + " - faz chamada de vídeo" + "\n-------------------");
            }
        }
        return out.toString();
    }
}