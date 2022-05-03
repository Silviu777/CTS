package memento.clase;

import java.util.ArrayList;
import java.util.List;

public class Autogara {

    private List<MementoAutobuz> listaMemento;

    public Autogara() {
        this.listaMemento = new ArrayList<>();
    }

    public void addMemento(MementoAutobuz mementoAutobuz) {
        listaMemento.add(mementoAutobuz);
    }

    public MementoAutobuz getMementoAutobuz(int index) {
        return listaMemento.get(index);
    }
}
