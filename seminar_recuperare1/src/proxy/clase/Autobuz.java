package proxy.clase;

public class Autobuz implements MijlocTransport {

    private String numeSofer;
    private int nrCalatori;
    private int nrLocuri;

    public Autobuz(String numeSofer, int nrCalatori, int nrLocuri) {
        this.numeSofer = numeSofer;
        this.nrCalatori = nrCalatori;
        this.nrLocuri = nrLocuri;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul a oprit in statie cu un numar de " + nrCalatori + " calatori");
    }
}
