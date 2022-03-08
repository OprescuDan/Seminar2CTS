package clase;


public class Elev extends Aplicant{
	private int clasa;
	private String tutore;

	public Elev() {
		super();
	}
	
	public void setClasa(int i) {
		this.clasa = i;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	@Override
	public String toString() {
		final StringBuilder sb=new StringBuilder("Angajat{");
		sb.append(super.toString());
		sb.append("clasa=" ).append(clasa);
		sb.append("tutore=" ).append(tutore);
		sb.append("}");
		return sb.toString();
	}
	


}
