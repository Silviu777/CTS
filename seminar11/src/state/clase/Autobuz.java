package state.clase;

public class Autobuz {

    private int nrAutobuz;
    private Stare stare;

    public Autobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        this.stare = new StareLaCapatLinie();
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public Stare getStare() {
        return stare;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public void pleacaInCursa() {
         new StareInCursa().actualizeazaStare(this);
    }

    public void intraInService() {
        new StareInService().actualizeazaStare(this);
    }

    public void ieseDinService() {
        new StareLaCapatLinie().actualizeazaStare(this);
    }

    public void ajungeCapatLinie() {
        new StareLaCapatLinie().actualizeazaStare(this);;
    }
}
