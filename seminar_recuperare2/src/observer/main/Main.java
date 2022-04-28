package observer.main;

import observer.clase.Autobuz;
import observer.clase.Calator;
import observer.clase.Observer;
import observer.clase.Subiect;

public class Main {
    public static void main(String[] args) {

        Subiect autobuz = new Autobuz(133);

        Observer calator1 = new Calator("John");
        Observer calator2 = new Calator("Mihai");

        autobuz.addCalator(calator1);
        autobuz.addCalator(calator2);
        autobuz.notificaCalatori();

        autobuz.removeCalator(calator1);
        autobuz.notificaCalatori();
    }
}
