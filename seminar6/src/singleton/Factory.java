package singleton;

import singleton.family.*;

public class Factory {
    public MijlocTransport createObject(TipTransport tip, String nrInmat) {
        switch (tip) {
            case AUTOBUZ:
                return new Autobuz(nrInmat);

            case TRAMVAI:
                return new Tramvai(nrInmat);

            case TROLEIBUZ:
                return new Troleibuz(nrInmat);
            default:
                return null;
        }
    }
}
