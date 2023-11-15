package br.edu.ifpb.validators;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidator{
    String numero;
    public boolean NumberValidator(String numero, List<String> numeros) {
        this.numero = numero;
        boolean existeNumero = numeros.contains(numero);

        String cpfPattern = "\\d{2}\s\\d{5}\s\\d{4}";

        // Use the Pattern and Matcher classes to perform the match
        Pattern pattern = Pattern.compile(cpfPattern);
        Matcher matcher = pattern.matcher(numero);

        return matcher.matches() && !existeNumero;
    }
    }
