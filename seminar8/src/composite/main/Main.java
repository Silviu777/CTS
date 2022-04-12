package composite.main;

import composite.clase.Autobuz;
import composite.clase.Flota;

public class Main {
    public static void main(String[] args) {

        Autobuz autobuz1 = new Autobuz("Mercedes", "M445", 62);
        Autobuz autobuz2 = new Autobuz("Mercedes", "M721", 73);
        Autobuz autobuz3 = new Autobuz("Otokar", "Y-UU3", 53);
        Autobuz autobuz4 = new Autobuz("Volkswagen", "BV-7", 58);

        Flota mici = new Flota("Autobuze mici");
        Flota mari = new Flota("Autobuze mari");
        Flota flota = new Flota("STB");

        mici.adaugaItem(autobuz3);
        mici.adaugaItem(autobuz4);
        mari.adaugaItem(autobuz1);
        mari.adaugaItem(autobuz2);

        flota.adaugaItem(mici);
        flota.adaugaItem(mari);

        flota.descriereItem();
        System.out.println("Garantie pt flota mare - " + mari.calculeazaSumaGarantata(2));

    }
}
