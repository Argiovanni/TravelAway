package ressource;

import java.time.LocalDateTime;

public class Trajet {
	private Station depart;
	private Station arrivee;
	private LocalDateTime dateDepart;
	private int tempsTrajet;
	
	public Trajet(Station depart, Station arrivee, LocalDateTime dateDepart) {
		this.depart = depart;
		this.arrivee = arrivee;
		this.dateDepart = dateDepart;
	}

	public Station getDepart() {
		return depart;
	}

	public Station getArrivee() {
		return arrivee;
	}

	public LocalDateTime getDateDepart() {
		return dateDepart;
	}

	public int getTempsTrajet() {
		return tempsTrajet;
	}
}
