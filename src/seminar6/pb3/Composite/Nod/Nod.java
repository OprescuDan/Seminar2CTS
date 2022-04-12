package seminar6.pb3.Composite.Nod;

public interface Nod {
    void adaugaNod(Nod nod) throws Exception;
    void stergeNod(Nod nod) throws Exception;
    Nod getNod(int index);
    void afiseazaDescriere();
    float calculeazaSumaGarantie(float pretPeLoc);
}
