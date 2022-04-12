package facade.main;

import facade.clase.Autobuz;
import facade.clase.Fatada;

public class Main {
    public static void main(String[] args) {

        Autobuz autobuz = new Autobuz();
        Fatada.deschideUsi(autobuz);
        Fatada.punePeLiber(autobuz);
    }
}
