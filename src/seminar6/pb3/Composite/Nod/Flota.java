package seminar6.pb3.Composite.Nod;

import java.util.ArrayList;
import java.util.List;

public class Flota implements Nod{

    private String nume;
    private List<Nod> noduri;

    public Flota(String nume) {
        this.nume = nume;
        noduri=new ArrayList<Nod>();
    }

    @Override
    public void adaugaNod(Nod nod)  {
        noduri.add(nod);
    }

    @Override
    public void stergeNod(Nod nod) throws Exception {
        noduri.remove(nod);
    }

    @Override
    public Nod getNod(int index) {
        return noduri.get(index);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(nume);
        for(Nod nod : noduri)
            nod.afiseazaDescriere();

    }

    @Override
    public float calculeazaSumaGarantie(float pretPeLoc) {
        float suma= 0;
        for ( Nod nod : noduri)
            suma=nod.calculeazaSumaGarantie(pretPeLoc);
        return suma;
    }
}
