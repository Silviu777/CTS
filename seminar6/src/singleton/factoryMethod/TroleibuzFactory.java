package singleton.factoryMethod;

public class TroleibuzFactory implements Factory {

    @Override
    public MijlocTransport createObject(String nrInmat) {
        return new Troleibuz(nrInmat);
    }

}