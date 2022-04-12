package facade.clase;

public class Fatada {

    public static void deschideUsi(Autobuz autobuz) {

        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
    }

    public static void punePeLiber(Autobuz autobuz) {

        autobuz.punePeLiberUsaFata();
        autobuz.punePeLiberUsaMijloc();
        autobuz.punePeLiberUsaSpate();
    }
}
