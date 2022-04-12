package seminar6.p5.Proxy;

public class Autobuz implements MijlocTransport{
    private String numeSofer;
    private int nrLocuri;
    private int nrCalatori;

    public Autobuz(String numeSofer, int nrLocuri, int nrCalatori) {
        this.numeSofer = numeSofer;
        this.nrLocuri = nrLocuri;
        this.nrCalatori = nrCalatori;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("autobuzul a oprit in statie cu " + nrCalatori + " calatori");
    }

    public int getNrCalatori(){
        return this.nrCalatori;
    }
}
