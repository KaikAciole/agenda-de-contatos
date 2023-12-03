package Validators;

import domain.Agenda;

public class NameValidator extends Validator<String> {
    private final Agenda agenda = Agenda.getInstance();

    @Override
    public boolean validate(String nomeSobrenome){
        return !agenda.existeNome(nomeSobrenome);
    }
}
