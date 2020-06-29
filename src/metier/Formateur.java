package metier;

public class Formateur {

	private String nom ;

	public Formateur(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Formateur [nom=" + nom + "]";
	}
	
	
}
