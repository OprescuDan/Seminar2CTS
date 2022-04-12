package seminar6.p5.Main;

import seminar6.p5.Proxy.Autobuz;
import seminar6.p5.Proxy.AutobuzNoapte;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("mircea",30,14);
        autobuz.opresteInStatie();

        AutobuzNoapte autobuz1=new AutobuzNoapte(autobuz);
        autobuz1.opresteInStatie();

    }
}
