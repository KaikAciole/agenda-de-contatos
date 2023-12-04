package domain;

import repository.ContatoRepository;

import java.util.List;
import java.util.stream.Collectors;


public class Agenda {

    private static Agenda instance;
    private ContatoRepository repository;

    public Agenda() {
        repository = ContatoRepository.getInstance();
    }

    public static Agenda getInstance() {
        if (instance == null) {
            instance = new Agenda();
        }

        return instance;
    }

    public Contato get(int index) {
        return repository.getAll().get(index);
    }

    public void adicionaContato(String nome, String sobrenome, String numero) {
        Contato contato = new Contato(nome, sobrenome, numero);
        repository.add(contato);
    }

    public void adicionaContato(String nome, String sobrenome, String numero, Relacionamento relacionamento, RedeSocial redesocial, String aniversario, String endereco) {
        Contato contato = new Contato(nome, sobrenome, numero, relacionamento, redesocial, aniversario, endereco);
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

    public void removerContato(int index){
        Contato c = this.get(index);
        repository.remove(c);
    }

    public boolean existeNumero(String numero){
        return repository.existsNumber(numero);
    }

    public boolean existeNome(String numero){
        return repository.existsName(numero);
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
        return repository.getAll().stream().filter(c -> c.getRelacionamento().equals((Relacionamento) relacionamento)).collect(Collectors.toList());
    }

    public List<Contato> filtrarChamadaDeVideo(){
        return repository.getAll().stream().filter(c -> c.getRedeSocial().equals(RedeSocial.TELEGRAM) ||
                c.getRedeSocial().equals(RedeSocial.WHATSAPP)).collect(Collectors.toList());

    }}