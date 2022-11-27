package ressource;

public class Passager {
	private String nom;
	private Billet[] listeBillet = new Billet[20];
	
	public Passager(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}
	
	
	
}
