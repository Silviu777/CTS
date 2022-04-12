package composite.clase;

public interface Item {

    void descriereItem();

    void adaugaItem(Item item) throws Exception;

    void stergeItem(Item item) throws Exception;

    Item getItem(int position) throws Exception;

    float calculeazaSumaGarantata(float pretPerLoc);

}
