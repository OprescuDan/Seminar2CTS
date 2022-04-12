package SEMINAR5.Main;

import SEMINAR5.Builder.AutobuzBuilder;
import SEMINAR5.Builder.AutobuzLinie;
import SEMINAR5.Prototype.Autobuz;
import SEMINAR5.Prototype.MijlocTransport;

public class Main {

    public static void main(String[] args) {
        MijlocTransport autobuz=new Autobuz("Dorian");

        try {
            MijlocTransport autobuz1 = autobuz.copiaza();
            System.out.println(autobuz.toString() + "\n" + autobuz1.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        AutobuzBuilder autobuzBuilder=new AutobuzBuilder();
        autobuzBuilder.setNrLinie(79);

        AutobuzLinie autobuzLinie=new AutobuzBuilder().build();
        System.out.println(autobuzLinie.toString());

        SEMINAR5.BuilderV2.AutobuzBuilder autobuzBuilder1=new SEMINAR5.BuilderV2.AutobuzBuilder();
        autobuzBuilder1.setAreOprire(false).setNrLinie(25);
        SEMINAR5.BuilderV2.AutobuzLinie autobuzLinie1=autobuzBuilder1.build();
        System.out.println(autobuzLinie1.toString());
    }
}
