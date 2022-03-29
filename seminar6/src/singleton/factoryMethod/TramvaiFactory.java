package singleton.factoryMethod;

public class TramvaiFactory implements Factory {

    @Override
    public MijlocTransport createObject(String nrInmat) {
        return new Tramvai(nrInmat);
    }

}