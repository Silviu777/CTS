package command.clase;

public class ComandaPlecare implements Comanda {

    private int nrLinie;
    private Autobuz autobuz;

    public ComandaPlecare(int nrLinie, Autobuz autobuz) {
        this.nrLinie = nrLinie;
        this.autobuz = autobuz;
    }

    @Override
    public void executa() {
        autobuz.pornesteInCursa(nrLinie);
    }
}
