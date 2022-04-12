package seminar6.pb2.main;

import seminar6.pb2.clase.Autobuz;
import seminar6.pb2.clase.Facade;

public class main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz();
        Facade.deschideUsi(autobuz);
        Facade.liberUsi(autobuz);
    }
}
