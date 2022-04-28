package flyweight.clase;

public class Linie implements AutobuzLinie {

    private int nrLinie;
    private String primaLinie;
    private String ultimaLinie;

    public Linie(int nrLinie, String primaLinie, String ultimaLinie) {
        this.nrLinie = nrLinie;
        this.primaLinie = primaLinie;
        this.ultimaLinie = ultimaLinie;
    }

    @Override
    public void afiseazaDetaliiAutobuzLinie(Autobuz autobuz) {
        System.out.println("Linia " + toString() + " circula autobuzul " + autobuz.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Linie{");
        sb.append("nrLinie=").append(nrLinie);
        sb.append(", primaLinie='").append(primaLinie).append('\'');
        sb.append(", ultimaLinie='").append(ultimaLinie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
