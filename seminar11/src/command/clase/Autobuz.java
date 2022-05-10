package command.clase;

public class Autobuz {

    private String model;

    public Autobuz(String model) {
        this.model = model;
    }

    public void pornesteInCursa(int nrLinie) {
        System.out.println("Autobuzul " + model + " a plecat in cursa pe linia " + nrLinie);
    }
}
