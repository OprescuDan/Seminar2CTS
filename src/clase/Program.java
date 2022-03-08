package clase;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		ApplicantsReader readerAngajati = new AngajatiReader();
		try {
			listaAngajati = readerAngajati.citireAplicanti("angajati.txt");
			for (Aplicant angajat : listaAngajati) {
				System.out.println(angajat.toString());
				angajat.afisareSalariuZilnic(1000);
				angajat.afisareStatut();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
