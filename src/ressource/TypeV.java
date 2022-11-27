package ressource;

public enum TypeV {
	A("Avion"), T("Train"), S("Bateau"), B("Bus");
	
	private String nom;
	
	private TypeV(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return nom;
	}
}
