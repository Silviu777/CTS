package strategy.main;

import strategy.clase.CardBancar;
import strategy.clase.Validator;

public class Main {
    public static void main(String[] args) {

        Validator validator = new Validator(7);
        validator.valideazaCalatorie();

        validator.setModPlata(new CardBancar());
        validator.valideazaCalatorie();
    }
}
