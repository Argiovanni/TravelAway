package ressource;

public class Station {
	private String nom;
	private int nbVehiculeMax;
	private Vehicule[] vehiculePresent;
	private TypeS type;

	public Station(String nom, int nbVehiculeMax, TypeS type) {
		this.nom = nom;
		this.nbVehiculeMax = nbVehiculeMax;
		this.vehiculePresent = new Vehicule[nbVehiculeMax];
		this.type = type;
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

	public TypeS getType() {
		return type;
	}
	
}
