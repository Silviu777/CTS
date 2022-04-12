package decorator.clase;

public class PrintBilet implements Printer {

    @Override
    public void print() {
        System.out.println("Bilet printat!");
    }
}
