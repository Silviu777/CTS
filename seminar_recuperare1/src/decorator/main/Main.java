package decorator.main;

import decorator.clase.Decorator;
import decorator.clase.DecoratorAbstract;
import decorator.clase.PrintBilet;
import decorator.clase.Printer;

public class Main {
    public static void main(String[] args) {

        Printer printer = new PrintBilet();
        printer.print();

        DecoratorAbstract decoratorAbstract = new Decorator(printer, "La multi ani!");
        decoratorAbstract.print();
        decoratorAbstract.printeazaMesaj();
    }
}
