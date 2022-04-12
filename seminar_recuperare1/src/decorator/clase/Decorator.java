package decorator.clase;

public class Decorator extends DecoratorAbstract {

    private String mesaj;

    public Decorator(Printer printer, String mesaj) {
        super(printer);
        this.mesaj = mesaj;
    }

    @Override
    public void printeazaMesaj() {
        System.out.println(mesaj);
    }
}
