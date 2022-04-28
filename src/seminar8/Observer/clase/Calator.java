package seminar8.Observer.clase;

public class Calator implements Observer{
    String nume;

    public Calator(String nume){
        this.nume=nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(nume + "ai primit urmatorul mesaj:" + mesaj);
    }
}
