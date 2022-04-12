package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Flota implements Item {

    private String denumire;
    private List<Item> autobuze;

    public Flota(String dimensiune) {
        this.denumire = dimensiune;
        this.autobuze = new ArrayList<>();
    }

    @Override
    public void descriereItem() {
        for (Item item : autobuze) {
            item.descriereItem();
        }
    }

    @Override
    public void adaugaItem(Item item) {
        autobuze.add(item);
    }

    @Override
    public void stergeItem(Item item) {
        autobuze.remove(item);
    }

    @Override
    public Item getItem(int position) {
        return autobuze.get(position);
    }

    @Override
    public float calculeazaSumaGarantata(float pretPerLoc) {
        float suma = 0;
        for (Item item : autobuze) {
            suma += item.calculeazaSumaGarantata(pretPerLoc);
        }
        return suma;
    }
}
