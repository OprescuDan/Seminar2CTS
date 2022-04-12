package SEMINAR5.BuilderV2;

public class AutobuzBuilder implements Builder{
    private int nrLinie;
    private String numeSofer;
    private boolean deschideUsile;
    private boolean areOprire;
    private String textDerulat;
    private String model;
    private int nrCalatori;

    public AutobuzBuilder() {
        this.nrLinie = 1;
        this.numeSofer = "Marian";
        this.deschideUsile = true;
        this.areOprire = true;
        this.textDerulat = "Piata Romana";
        this.model = "Mercedes";
        this.nrCalatori = 17;
    }

    public AutobuzBuilder setNrLinie(int nrLinie) {
        this.nrLinie=nrLinie;
        return this;
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.numeSofer=numeSofer;
        return this;
    }

    public AutobuzBuilder setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile=deschideUsile;
        return this;
    }

    public AutobuzBuilder setAreOprire(boolean areOprire) {
        this.areOprire=areOprire;
        return this;
    }

    public AutobuzBuilder setTextDerulat(String textDerulat) {
        this.textDerulat=textDerulat;
        return this;
    }

    public AutobuzBuilder setModel(String model) {
        this.model=model;
        return this;
    }

    public AutobuzBuilder setNrCalatori(int nrCalatori) {
        this.nrCalatori=nrCalatori;
        return this;
    }


    @Override
    public AutobuzLinie build() {
        return new AutobuzLinie(nrLinie,numeSofer,deschideUsile,areOprire,textDerulat,model,nrCalatori);

    }

}
