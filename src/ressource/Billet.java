package ressource;

public class Billet {
	private Passager passager;
	private Compagnie compagnie;
	private Vehicule vehicule;
	private Trajet trajet;
	
	public Billet(Passager passager, Compagnie compagnie, Vehicule vehicule, Trajet trajet) {
		super();
		this.passager = passager;
		this.compagnie = compagnie;
		this.vehicule = vehicule;
		this.trajet = trajet;
	}
	
	public Passager getPassager() {
		return passager;
	}
	public Compagnie getCompagnie() {
		return compagnie;
	}
	public Vehicule getVehicule() {
		return vehicule;
	}
	public Trajet getTrajet() {
		return trajet;
	}
}
