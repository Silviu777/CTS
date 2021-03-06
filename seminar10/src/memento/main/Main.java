package memento.main;

import memento.clase.Autobuz;
import memento.clase.Autobaza;
import memento.clase.MementoAutobuz;

public class Main {
    public static void main(String[] args) {

        Autobuz autobuz = new Autobuz("Marius", "BMW", 2019, 9);
        Autobaza autobaza = new Autobaza();
        MementoAutobuz mementoAutobuz = autobuz.createMemento();

        autobaza.addMemento(mementoAutobuz);

        autobuz.setSofer("John");
        autobaza.addMemento(autobuz.createMemento());

        autobuz.setConsumMediu(8);
        autobaza.addMemento(autobuz.createMemento());

        System.out.println(autobuz);
        autobuz.setMementoAutobuz(autobaza.getMementoAutobuz(0));
        System.out.println("\nDupa preluare memento din autobaza: ");
        System.out.println(autobuz);

    }
}
