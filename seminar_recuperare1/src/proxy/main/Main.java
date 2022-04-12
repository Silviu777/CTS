package proxy.main;

import proxy.clase.Autobuz;
import proxy.clase.AutobuzNoapte;

public class Main {
    public static void main(String[] args) {

        Autobuz autobuz1 = new Autobuz("Dorian", 23, 33);
        Autobuz autobuz2 = new Autobuz("Marian", 0, 30);
        autobuz1.opresteInStatie();

        AutobuzNoapte autobuzNoapte = new AutobuzNoapte(autobuz2);
        autobuzNoapte.opresteInStatie();
    }
}
