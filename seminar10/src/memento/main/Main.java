package memento.main;

import memento.clase.Autobuz;
import memento.clase.Autogara;
import memento.clase.MementoAutobuz;

public class Main {
    public static void main(String[] args) {

        Autobuz autobuz = new Autobuz("Marius", "BMW", 2019, 9);
        Autogara autogara = new Autogara();
        MementoAutobuz mementoAutobuz = autobuz.createMemento();

        autogara.addMemento(mementoAutobuz);

        autobuz.setSofer("John");
        autogara.addMemento(autobuz.createMemento());

        autobuz.setConsumMediu(8);
        autogara.addMemento(autobuz.createMemento());

        System.out.println(autobuz);
        autobuz.setMementoAutobuz(autogara.getMementoAutobuz(0));
        System.out.println("\nDupa preluare memento din autobaza: ");
        System.out.println(autobuz);

    }
}
