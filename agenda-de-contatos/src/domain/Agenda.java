package domain;

import repository.CSVDataService;
import repository.ContatoRepository;

import java.util.List;


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

    public List<Contato> listarContatos() {
        return repository.getAll();
    }

    public List<Contato> exibirContato(String nomeSobrenome){
        return repository.search(nomeSobrenome);
    }

    public void removerContato(String nomeSobrenome){
        Contato c = repository.search(nomeSobrenome).get(0);
        repository.remove(c);
    }

    public void setNome(String nomeSobrenome, String nomeMudado){
        Contato c = repository.search(nomeSobrenome).get(0);
        c.setNome(nomeMudado);
    }

    public void setSobrenome(String nomeSobrenome, String sobrenome){
        Contato c = repository.search(nomeSobrenome).get(0);
        c.setSobrenome(sobrenome);
    }

    public void setNumero(String nomeSobrenome, String numero){
        Contato c = repository.search(nomeSobrenome).get(0);
        c.setNumero(numero);
    }

    public void setRelacionamento(String nomeSobrenome, Relacionamento relacionamento){
        Contato c = repository.search(nomeSobrenome).get(0);
        c.setRelacionamento(relacionamento);
    }

    public void setRedeSocial(String nomeSobrenome, RedeSocial redeSocial){
        Contato c = repository.search(nomeSobrenome).get(0);
        c.setRedeSocial(redeSocial);
    }

    public void setAniversario(String nomeSobrenome, String aniversario){
        Contato c = repository.search(nomeSobrenome).get(0);
        c.setAniversario(aniversario);
    }

    public void setEndereco(String nomeSobrenome, String endereco){
        Contato c = repository.search(nomeSobrenome).get(0);
        c.setEndereco(endereco);
    }

    public List<Contato> filtrarRelacionamento(Relacionamento relacionamento) {
        return (List<Contato>) repository.getAll().stream().filter(c -> c.getRelacionamento().equals((Relacionamento) relacionamento));
    }

    public List<Contato> filtrarChamadaDeVideo(){
        List<Contato> telegram = (List<Contato>) repository.getAll().stream().filter(c -> c.getRedeSocial().equals(RedeSocial.TELEGRAM));
        List<Contato> whatsapp = (List<Contato>) repository.getAll().stream().filter(c -> c.getRedeSocial().equals(RedeSocial.TELEGRAM));

}}