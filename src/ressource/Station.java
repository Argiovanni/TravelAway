package ressource;

public class Station {
	private String nom;
	private String ville; // adresse quand api osm 
	private int nbVehiculeMax;
	private Vehicule[] vehiculePresent;

	public Station(String nom, String ville, int nbVehiculeMax) {
		this.nom = nom;
		this.ville = ville;
		this.nbVehiculeMax = nbVehiculeMax;
		this.vehiculePresent = new Vehicule[nbVehiculeMax];
	}
	
	public String getNom() {
		return nom;
	}

	public int getNbVehiculeMax() {
		return nbVehiculeMax;
	}

	public Vehicule[] getVehiculePresent() {
		return vehiculePresent;
	}

	public String getVille() {
		return ville;
	}
	
}
