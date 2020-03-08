package pglp.pglp3_5;



public class Metier {
	private static Affiche a;
	public Metier(Affiche a) {
		this.a=a;
	}
	public void uneMethodeMetier() {
	
		a.afficher(":Début de uneMethodeMetier");
		
		
		a.afficher(":Fin de uneMethodeMetier");
	
	
	}
}
