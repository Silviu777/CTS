package singleton.factoryMethod;

public class MainFactory {
    public static void main(String[] args) {

        MijlocTransport autobuz = new AutobuzFactory().createObject("B-800-ZED");
        System.out.println(autobuz);

        MijlocTransport tramvai = new TramvaiFactory().createObject("B-500-BUC");
        System.out.println(tramvai);

        MijlocTransport troleibuz = new TroleibuzFactory().createObject("B-900-EWX");
        System.out.println(troleibuz);
    }
}