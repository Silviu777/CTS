package proxy.clase;

public class AutobuzNoapte implements MijlocTransport {

    private Autobuz autobuz;

    public AutobuzNoapte(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {

        if (autobuz.getNrCalatori() > 0) {
            autobuz.opresteInStatie();
        }
        else {
            System.out.println("Autobuzul se intoarce la baza!");
        }
    }
}
