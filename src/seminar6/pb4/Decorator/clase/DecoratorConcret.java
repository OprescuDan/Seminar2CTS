package seminar6.pb4.Decorator.clase;

public class DecoratorConcret extends DecoratorAbstract{
    private String mesaj;

    public DecoratorConcret(Printer printer, String mesaj) {
        super(printer);
        this.mesaj = mesaj;
    }

    @Override
    public void printMesaj() {
        System.out.println(mesaj);
    }
}
