package adapter.subteran;

public class ValidatorMetrou implements ValidatorSubteran {

    @Override
    public void valideazaCalatorie() {
        System.out.println("Calatorie validata!");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("Abonament validat!");
    }
}
