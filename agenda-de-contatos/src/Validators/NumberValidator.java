package Validators;

import domain.Agenda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidator extends Validator<String> {
    private final Agenda agenda = Agenda.getInstance();
    private final boolean checkIfExists;

    public NumberValidator(boolean checkIfExists) {
        this.checkIfExists = checkIfExists;
    }

    @Override
    public boolean validate(String numero) {
        String numeroPattern = "\\(\\d{2}\\)\\d{5}-\\d{4}";

        Pattern pattern = Pattern.compile(numeroPattern);
        Matcher matcher = pattern.matcher(numero);

        return matcher.matches() && (!checkIfExists || !agenda.existe(numero));
    }
}
