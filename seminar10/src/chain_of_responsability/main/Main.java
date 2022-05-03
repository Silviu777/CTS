package chain_of_responsability.main;

import chain_of_responsability.clase.*;

public class Main {
    public static void main(String[] args) {

        Handler troleibuzHandler = new TroleibuzHandler(3);
        Handler autobuzHandler  = new AutobuzHandler(5);
        Handler tramvaiHandler = new TramvaiHandler(10);
        Handler metrouHandler = new MetrouHandler(1000);

        troleibuzHandler.setHandler(autobuzHandler);
        autobuzHandler.setHandler(tramvaiHandler);
        tramvaiHandler.setHandler(metrouHandler);

//        troleibuzHandler.afiseazaMijlocTransport(2);
//        troleibuzHandler.afiseazaMijlocTransport(7);
//        troleibuzHandler.afiseazaMijlocTransport(12);

        System.out.println("Pentru Cluj: ");

        Handler troleibuzCluj = new TroleibuzHandler(5);
        Handler autobuzCLuj = new AutobuzHandler(1000);
        Handler tramvaiCluj = new TramvaiHandler(2);
        Handler metrouCluj = new MetrouHandler(1);

        metrouCluj.setHandler(tramvaiCluj);
        tramvaiCluj.setHandler(troleibuzCluj);
        troleibuzCluj.setHandler(autobuzCLuj);

        metrouCluj.afiseazaMijlocTransport(3);
        metrouCluj.afiseazaMijlocTransport(6);

    }
}
