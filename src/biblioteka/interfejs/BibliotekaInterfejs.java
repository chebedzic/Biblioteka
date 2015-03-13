package biblioteka.interfejs;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Knjiga;

public interface BibliotekaInterfejs {

	public void dodajKnjigu(Knjiga knjiga);
	public void ObrisiKnjigu(Knjiga knjiga);
	public LinkedList<Knjiga> PronadjiKnjigu(String naslov, long ISBN, String izdavac, Autor autor);
	
}
