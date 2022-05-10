package command.main;

import command.clase.Autobuz;
import command.clase.ComandaPlecare;
import command.clase.Operator;

public class Main {
    public static void main(String[] args) {

        Autobuz a1 = new Autobuz("Otokar UK-802");
        Autobuz a2 = new Autobuz("Mercedes RX-319");

        Operator operator = new Operator();
        operator.addComanda(new ComandaPlecare(133, a1));
        operator.addComanda(new ComandaPlecare(301, a2));

        operator.executaComanda();
        operator.executaComanda();
    }
}
