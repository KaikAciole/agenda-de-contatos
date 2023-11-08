package service;

import domain.Contato;
import repository.ContatoRepository;
import java.util.List;

public class ContatoService {
    private final ContatoRepository repository;

    public ContatoService(ContatoRepository repository) {
        this.repository = repository;
    }
    public void adicionarContato(String nome, String sobrenome, String numero) {
        repository.add(new Contato(nome, sobrenome, numero));
    }

    public Contato get(int index) {
        return repository.getAll().get(index);
    }

    public List<Contato> buscar(String termo) {
        return repository.search(termo);
    }

    public List<Contato> getPacientes() {
        return repository.getAll();
    }

    public boolean existe(String cpf) {
        return repository.exists(cpf);
    }

    public void editar(String nome, String sobrenome, String numero) {
        repository.update(new Contato(nome, sobrenome, numero));
    }

    public void remover(Contato c) {
        repository.remove(c);
    }
}
