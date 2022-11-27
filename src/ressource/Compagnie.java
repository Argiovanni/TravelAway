package ressource;

public class Compagnie {
	private String nom;
	private Vehicule[] vehiculePossedes = new Vehicule[50];
	private Billet[] listeBillet = new Billet[1000];
	
	public Compagnie(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public Vehicule[] getVehiculePossedes() {
		return vehiculePossedes;
	}

	public Billet[] getListeBillet() {
		return listeBillet;
	}
}
