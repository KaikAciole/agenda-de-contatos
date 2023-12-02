package repository;

import domain.Contato;

import java.util.List;

public class ContatoRepository {
    private ContatoDataService dataService;
    private static ContatoRepository instance;

    private ContatoRepository(ContatoDataService dataService) {
        this.dataService = dataService;
    }

    public static ContatoRepository getInstance() {
        if (instance == null) {
            instance = new ContatoRepository(new InMemoryDataService());
            CSVDataService.importar();
        }

        return instance;
    }

    public void setRepository(ContatoDataService dataService) {
        this.dataService = dataService;
    }

    public void add(Contato p) {
        dataService.add(p);
    }

    public List<Contato> getAll() {
        return dataService.getAll();
    }

    public void update(Contato p) {
        dataService.update(p);
    }

    public List<Contato> search(String termo) {
        return dataService.search(termo);
    }

    public boolean exists(String num) {
        return dataService.exists(num);
    }

    public void remove(Contato p) {
        dataService.remove(p);
    }
}
