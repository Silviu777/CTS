package state.clase;

public class StareLaCapatLinie implements Stare {

    @Override
    public void actualizeazaStare(Autobuz autobuz) {

        if (!(autobuz.getStare() instanceof StareLaCapatLinie)) {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " se afla la capatul liniei!");
            autobuz.setStare(this);
        }
        else {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " nu a ajuns la capatul liniei!");
        }
    }
}
