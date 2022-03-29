package singleton.factoryMethod;

public abstract class MijlocTransport {

    protected String nrInmatriculare;

    protected MijlocTransport(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

}