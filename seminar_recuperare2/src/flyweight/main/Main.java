package flyweight.main;

import flyweight.clase.Autobuz;
import flyweight.clase.FabricaLinie;
import flyweight.clase.Linie;

public class Main {
    public static void main(String[] args) {

        Autobuz autobuz1 = new Autobuz("BMW", 2019, 62);
        Autobuz autobuz2 = new Autobuz("Otokar", 2020, 68);
        Autobuz autobuz3 = new Autobuz("MAN", 2017, 55);

        FabricaLinie fabricaLinie = new FabricaLinie();
        fabricaLinie.getLinie(133).afiseazaDetaliiAutobuzLinie(autobuz1);
        fabricaLinie.getLinie(133).afiseazaDetaliiAutobuzLinie(autobuz2);

        fabricaLinie.getLinie(247).afiseazaDetaliiAutobuzLinie(autobuz3);
    }
}
