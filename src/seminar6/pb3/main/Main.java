package seminar6.pb3.main;

import seminar6.pb3.Composite.Nod.Autobuz;
import seminar6.pb3.Composite.Nod.Flota;
import seminar6.pb3.Composite.Nod.Nod;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1= new Autobuz("BMW","e445",23);
        Autobuz autobuz2= new Autobuz("merc","cla",43);
        Autobuz autobuz3= new Autobuz("audi","r8",8);
        Autobuz autobuz4= new Autobuz("frr","spider",2);
        Autobuz autobuz5= new Autobuz("lamb","urus",86);
        Autobuz autobuz6= new Autobuz("mclaren","m40",2);


        try {
            Nod flota = new Flota("flota");
            Nod flota1 = new Flota("flota1");
            Nod flota2 = new Flota("flota2");
            Nod flota3 = new Flota("flota3");

            flota1.adaugaNod(autobuz1);
            flota1.adaugaNod(autobuz2);

            flota2.adaugaNod(autobuz3);
            flota2.adaugaNod(autobuz4);

            flota3.adaugaNod(autobuz5);
            flota3.adaugaNod(autobuz6);

            flota.adaugaNod(flota1);
            flota.adaugaNod(flota2);
            flota.adaugaNod(flota3);

            System.out.println("suma pt intreaga flota " + flota.calculeazaSumaGarantie(2));
            System.out.println("suma pt  flota1 " + flota1.calculeazaSumaGarantie(2));
        }
        catch (Exception e){
            System.out.println(e);
        }



    }
}
