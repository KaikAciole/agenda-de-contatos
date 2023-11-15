package br.edu.ifpb.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidator implements Validator<String> {
    public NumberValidator(boolean checkIfExists) {
        this.checkIfExists = checkIfExists;
    }

    @Override
    public boolean validate(String data) {
        String cpfPattern = "\\d{2}\\.\\d{3}\\.\\d{3}-\\d{2}";

        // Use the Pattern and Matcher classes to perform the match
        Pattern pattern = Pattern.compile(cpfPattern);
        Matcher matcher = pattern.matcher(data);

        return matcher.matches() && (!checkIfExists || !pacienteService.existe(data));
    }
}
