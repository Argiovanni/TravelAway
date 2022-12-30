package ressource;

public class Vehicule {
	private String id;
	private int nbPlaceMax;
	private Passager[] passagers;
	private Station localisation;
	private Trajet trajet;
	
	public Vehicule(int nbPlaceMax, Station localisation) {
		this.nbPlaceMax = nbPlaceMax;
		this.passagers = new Passager[nbPlaceMax];
		this.setLocalisation(localisation);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Trajet getTrajet() {
		return trajet;
	}

	public void setTrajet(Trajet trajet) {
		this.trajet = trajet;
	}

	public int getNbPlaceMax() {
		return nbPlaceMax;
	}

	public Passager[] getPassagers() {
		return passagers;
	}

	public Station getLocalisation() {
		return localisation;
	}

	public void setLocalisation(Station localisation) {
		this.localisation = localisation;
	}
	
}
