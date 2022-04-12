package strategy.clase;

public class CardSTB implements ModPlata {

    @Override
    public void plateste(float pret) {
        System.out.println("Platit cu cardul STB, pret: " + pret);
    }
}
