package seminar6.pb4.Decorator.clase;

public abstract class DecoratorAbstract implements Printer{
    Printer printer;

    public abstract void printMesaj();

    public DecoratorAbstract(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print() {
        printer.print();
    }
}
