package Factory.familie;

public class Factory {
    public mijlocTransport createObject(TipTransport tip, String nrInmatriculare){
        switch (tip){
            case AUTOBUZ:
                return new Autobuz(nrInmatriculare);
            case TRAMVAI:
                return new Tramvai(nrInmatriculare);
            case TROLEIBUZ:
                return new Troleibuz(nrInmatriculare);
            default:
                return null;
        }
    }
}
