package Factory.familie.faraEnum;

public class TroleibuzFactory implements Factory{

    @Override
    public MijlocTransport createObject(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
