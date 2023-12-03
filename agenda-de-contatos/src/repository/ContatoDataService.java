package repository;

import domain.Contato;

import java.util.List;

public interface ContatoDataService {
    void add(Contato c);
    List<Contato> getAll();
    void update(Contato p);
    List<Contato> search(String termo);
    boolean existsNumber(String numero);
    boolean existsName(String termo);
    void remove(Contato p);
}
