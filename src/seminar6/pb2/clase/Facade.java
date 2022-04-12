package seminar6.pb2.clase;

public class Facade {
    public static void deschideUsi(Autobuz autobuz){
        autobuz.deschideUsaFata();
        autobuz.liberUsaMijloc();
        autobuz.deschideUsaSpate();
    }

    public static void liberUsi(Autobuz autobuz){
        autobuz.liberUsaFata();
        autobuz.liberUsaMijloc();
        autobuz.deschideUsaSpate();
    }


}
