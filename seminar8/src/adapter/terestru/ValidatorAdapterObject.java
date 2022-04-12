package adapter.terestru;

import adapter.subteran.ValidatorMetrou;

public class ValidatorAdapterObject implements ValidatorTerestru {

    private ValidatorMetrou validatorMetrou;

    public ValidatorAdapterObject(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void valideazaBilet() {
        validatorMetrou.valideazaCalatorie();
    }

    @Override
    public void valideazaAbonament() {
        validatorMetrou.valideazaAbonament();
    }
}
