package seminar6.p5.Proxy;

public class AutobuzNoapte implements MijlocTransport{
    Autobuz autobuz;

    public AutobuzNoapte(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        if(autobuz.getNrCalatori()>0){
            autobuz.opresteInStatie();
        }
        else
            System.out.println("autobuzul se intoarce in autobaza");
    }
}
