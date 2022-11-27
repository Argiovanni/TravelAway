package user;

public enum TypeS {
	A("Aéroport"), G("Gare"), P("Port");
	
	private String nom;
	
	private TypeS(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return nom;
	}
}
