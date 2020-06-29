package metier;

public class Stagiaire {
	private String nom;

	public Stagiaire(String nom) {
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
		return "Stagiaire [nom=" + nom + "]";
	}
	
	
}
