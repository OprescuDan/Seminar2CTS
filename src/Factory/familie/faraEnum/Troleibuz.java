package Factory.familie.faraEnum;

public class Troleibuz extends MijlocTransport {

    protected Troleibuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Troleibuz{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
