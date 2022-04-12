package seminar6.pb3.Composite.Nod;

public class Autobuz implements Nod {

    private String model;
    private String constructor;
    private int nrLocuri;

    public Autobuz(String model, String constructor, int nrLocuri) {
        this.model = model;
        this.constructor = constructor;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void adaugaNod(Nod nod) throws Exception{
        throw new Exception("nu se poate adauga");
    }

    @Override
    public void stergeNod(Nod nod) throws Exception{
        throw new Exception("nu se poate sterge");
    }

    @Override
    public Nod getNod(int index) {
        return null;
    }

    @Override
    public void afiseazaDescriere() {

    }

    @Override
    public float calculeazaSumaGarantie(float pretPeLoc) {
        return nrLocuri*pretPeLoc;
    }
}
