package Factory.familie.faraEnum;

public class Autobuz extends MijlocTransport {
    protected Autobuz(String nrInmatriculare){
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
