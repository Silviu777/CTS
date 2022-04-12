package strategy.clase;

public class CardBancar implements ModPlata {

    @Override
    public void plateste(float pret) {
        System.out.println("Platit cu cardul bancar, pret: " + pret);
    }
}
