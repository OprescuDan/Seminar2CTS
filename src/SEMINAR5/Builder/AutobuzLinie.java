package SEMINAR5.Builder;

public class AutobuzLinie {
    private int nrLinie;
    private String numeSofer;
    private boolean deschideUsile;
    private boolean areOprire;
    private String textDerulat;
    private String model;
    private int nrCalatori;

    public AutobuzLinie() {
        this.nrLinie = 1;
        this.numeSofer = "Marian";
        this.deschideUsile = true;
        this.areOprire = true;
        this.textDerulat = "Piata Romana";
        this.model = "Mercedes";
        this.nrCalatori = 17;
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
