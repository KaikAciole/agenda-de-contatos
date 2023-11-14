package Validators;
import repository.ContatoRepository;
import service.ContatoService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumeroValidator implements Validator<String> {
    private static final ContatoService contatoService = new ContatoService(ContatoRepository.getInstance());
    private final boolean checkIfExists;

    public NumeroValidator(boolean checkIfExists) {
        this.checkIfExists = checkIfExists;
    }

    @Override
    public boolean validate(String numero) {
        String numeroPattern = "\\d{2}\\d{5}-\\d{4}"; /// (83)99821-1842

        Pattern pattern = Pattern.compile(numeroPattern);
        Matcher matcher = pattern.matcher(numero);

        return matcher.matches() && (!checkIfExists || !contatoService.existe(numero));
    }
}