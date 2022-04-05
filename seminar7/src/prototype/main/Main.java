package prototype.main;

import prototype.Autobuz;
import prototype.MijlocTransport;

public class Main {

    public static void main(String[] args) {

        Autobuz autobuz = new Autobuz("Marian");

        try {
            MijlocTransport autobuz1 = autobuz.copiaza();
            System.out.println(autobuz + "\n" + autobuz1);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
