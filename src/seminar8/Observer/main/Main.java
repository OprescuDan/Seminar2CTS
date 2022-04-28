package seminar8.Observer.main;

import seminar8.Observer.clase.Autobuz;
import seminar8.Observer.clase.Calator;
import seminar8.Observer.clase.Observer;
import seminar8.Observer.clase.Subiect;

public class Main {
    public static void main(String[] args) {
        Subiect autobuz=new Autobuz(33);

        Observer calator1=new Calator("Alex");
        Observer calator2=new Calator("Dan");
        Observer calator3=new Calator("Gelu");

        autobuz.adaugaCalator(calator1);
        autobuz.adaugaCalator(calator2);
        autobuz.notificareCalatori();
        autobuz.adaugaCalator(calator3);
        autobuz.stergeCalator(calator2);
        autobuz.notificareCalatori();
    }
}
