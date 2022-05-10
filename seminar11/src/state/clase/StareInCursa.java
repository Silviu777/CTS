package state.clase;

public class StareInCursa implements Stare {

    @Override
    public void actualizeazaStare(Autobuz autobuz) {

        if (autobuz.getStare() instanceof StareLaCapatLinie) {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " pleaca in cursa!");
            autobuz.setStare(this);
        }
        else {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " nu poate sa plece in cursa!");
        }
    }
}
