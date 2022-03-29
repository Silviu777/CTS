package singleton.factoryMethod;

public class AutobuzFactory implements Factory {

    @Override
    public MijlocTransport createObject(String nrInmat) {
        return new Autobuz(nrInmat);
    }

}