package adapter.main;

import adapter.subteran.ValidatorMetrou;
import adapter.terestru.Autobuz;
import adapter.terestru.ValidatorAdapterObject;

public class Main {
    public static void main(String[] args) {

        Autobuz autobuz = new Autobuz();
        ValidatorMetrou metrou = new ValidatorMetrou();
        metrou.valideazaAbonament();

        ValidatorAdapterObject adapterObject = new ValidatorAdapterObject(metrou);
        adapterObject.valideazaBilet();
        adapterObject.valideazaAbonament();

    }
}
