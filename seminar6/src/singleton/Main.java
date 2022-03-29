package singleton;

import singleton.family.MijlocTransport;
import singleton.family.TipTransport;

public class Main {

    public static void main (String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton1);

        Factory factory = new Factory();
        MijlocTransport mijlocTransport = factory.createObject(TipTransport.TRAMVAI, "B-777-YVY");
        MijlocTransport mijlocTransport1 = factory.createObject(TipTransport.TROLEIBUZ, "B-123-SZX");
        MijlocTransport mijlocTransport2 = factory.createObject(TipTransport.AUTOBUZ, "B-07-QPL");

        System.out.println(mijlocTransport);
        System.out.println(mijlocTransport1);
        System.out.println(mijlocTransport2);
    }

}