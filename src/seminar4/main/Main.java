package seminar4.main;
//import Factory.familie.Factory;
//import Factory.familie.TipTransport;
//import Factory.familie.mijlocTransport;
//import seminar4.Singleton;
import Factory.familie.faraEnum.*;

public class Main {

    public static void main(String[] args) {

//        Singleton s= Singleton.getInstance();
//        Singleton s2=Singleton.getInstance();
//        System.out.println(s);
//        System.out.println(s2);
//
//        Factory fabrica= new Factory();
//        mijlocTransport a= fabrica.createObject(TipTransport.AUTOBUZ,"101");
//        mijlocTransport tr= fabrica.createObject(TipTransport.TROLEIBUZ,"102");
//        mijlocTransport t= fabrica.createObject(TipTransport.TRAMVAI,"103");
//
//        System.out.println(a);
//        System.out.println(tr);
//        System.out.println(t);

        MijlocTransport autobuz=new AutobuzFactory().createObject("456");
        System.out.println(autobuz.toString());
    }
}
