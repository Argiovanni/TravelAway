package ressource;

public class Vehicule {
	private String id;
	private TypeV type;
	private int nbPlaceMax;
	private Passager[] passagers;
	private Trajet trajet;
	
	public Vehicule(TypeV type, int nbPlaceMax) {
		this.type = type;
		this.nbPlaceMax = nbPlaceMax;
		this.passagers = new Passager[nbPlaceMax];
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

	public TypeV getType() {
		return type;
	}

	public int getNbPlaceMax() {
		return nbPlaceMax;
	}

	public Passager[] getPassagers() {
		return passagers;
	}
	
}
