package repository;

import domain.Contato;

import java.util.List;

public interface ContatoDataService {
    void add(Contato c);
    List<Contato> getAll();
    void update(Contato p);
    List<Contato> search(String termo);
    boolean exists(String numero);
    void remove(Contato p);
}
