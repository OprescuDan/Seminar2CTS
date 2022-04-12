package seminar6.pb4.Main;

import seminar6.pb4.Decorator.clase.DecoratorAbstract;
import seminar6.pb4.Decorator.clase.DecoratorConcret;
import seminar6.pb4.Decorator.clase.PrintBilet;
import seminar6.pb4.Decorator.clase.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer=new PrintBilet();
        printer.print();

        DecoratorAbstract decoratorAbstract=new DecoratorConcret(printer,"lma cts");
        decoratorAbstract.print();
        decoratorAbstract.printMesaj();
    }
}
