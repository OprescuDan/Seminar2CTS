package SEMINAR5.BuilderV2;

public class AutobuzLinie {
    private int nrLinie;
    private String numeSofer;
    private boolean deschideUsile;
    private boolean areOprire;
    private String textDerulat;
    private String model;
    private int nrCalatori;



    public AutobuzLinie(int nrLinie, String numeSofer, boolean deschideUsile, boolean areOprire, String textDerulat, String model, int nrCalatori) {
        this.nrLinie = nrLinie;
        this.numeSofer = numeSofer;
        this.deschideUsile = deschideUsile;
        this.areOprire = areOprire;
        this.textDerulat = textDerulat;
        this.model = model;
        this.nrCalatori = nrCalatori;
    }

     void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

     void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

     void setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
    }

     void setAreOprire(boolean areOprire) {
        this.areOprire = areOprire;
    }

     void setTextDerulat(String textDerulat) {
        this.textDerulat = textDerulat;
    }

     void setModel(String model) {
        this.model = model;
    }

     void setNrCalatori(int nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("nrLinie=").append(nrLinie);
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", deschideUsile=").append(deschideUsile);
        sb.append(", areOprire=").append(areOprire);
        sb.append(", textDerulat='").append(textDerulat).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrCalatori=").append(nrCalatori);
        sb.append('}');
        return sb.toString();
    }


}
