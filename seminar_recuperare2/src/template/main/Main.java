package template.main;

import template.clase.Tramvai;
import template.clase.TramvaiProbe;

public class Main {
    public static void main(String[] args) {

        Tramvai tramvai = new Tramvai();
        tramvai.parcurgeTraseu();
        System.out.println("\n");
        tramvai.parcurgeTraseuInvers();

        System.out.println("\n");
        TramvaiProbe tramvaiProbe = new TramvaiProbe();
        tramvaiProbe.parcurgeTraseu();

        // grija la pattern! sa fie FINAL
    }
}
