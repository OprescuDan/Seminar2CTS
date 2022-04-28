package seminar8.FlyWeight.main;

import seminar8.FlyWeight.clase.Autobuz;
import seminar8.FlyWeight.clase.FabricaLinie;
import seminar8.FlyWeight.clase.Linie;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1= new Autobuz("Merc",2018,60);
        Autobuz autobuz2= new Autobuz("BMW",2016,31);
        Autobuz autobuz3= new Autobuz("Audi",2012,40);
        Autobuz autobuz4= new Autobuz("Skoda",2015,50);

        FabricaLinie fabricaLinie=new FabricaLinie();
        fabricaLinie.getLinie(133).afiseazaDetaliiAutobuzLinie(autobuz1);
        fabricaLinie.getLinie(133).afiseazaDetaliiAutobuzLinie(autobuz2);
        fabricaLinie.getLinie(148).afiseazaDetaliiAutobuzLinie(autobuz3);
        fabricaLinie.getLinie(102).afiseazaDetaliiAutobuzLinie(autobuz4);



    }
}
