package clase;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;

	public Student() {
		super();

	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public void setAn_studii(int an_studii) {
		this.anStudii= an_studii;
	}

	@Override
	public String toString() {
		final StringBuilder sb=new StringBuilder("Angajat{");
		sb.append(super.toString());
		sb.append("Facultate=" ).append(facultate);
		sb.append("AnStudii=" ).append(anStudii);
		sb.append("}");
		return sb.toString();
	}

	
}
