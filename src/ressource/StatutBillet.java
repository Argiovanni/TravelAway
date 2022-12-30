package ressource;

public enum StatutBillet {
	A("En Attente"), V("Validé"), T("Terminé");
	
	private String statut;
	
	private StatutBillet(String statut) {
		this.statut = statut;
	}
	@Override
	public String toString() {
		return statut;
	}
}
