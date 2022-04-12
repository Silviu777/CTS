package strategy.clase;

public class Sms implements ModPlata {

    @Override
    public void plateste(float pret) {
        System.out.println("Platit prin sms, pret: " + pret);
    }
}
