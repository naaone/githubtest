
public class GestionRepertoire {

	
	public static void main(String[] args) {
		Adresse uneAdresse = new Adresse("chez moi","chez moi deux","91240","saint michel sur orge");
		Adresse deuxAdresse = new Adresse("chez elle","chez elle deux","91700", "SGDB");
		//System.out.println(uneAdresse);
		//uneAdresse.affichage();
		
		Personne unePersonne = new Personne("Lemaire", "Nicolas", uneAdresse, "0155226633" );
		Personne deuxPersonne = new Personne ("Dupont", "Jennifer", deuxAdresse, "0253698745");
		//unePersonne.affichage();
		//deuxPersonne.affichage();
		System.out.println(unePersonne);
		System.out.println(deuxPersonne);
		
		Repertoire gouzi = new Repertoire();
		gouzi.ajouterPersonne(unePersonne);
		gouzi.ajouterPersonne(deuxPersonne);
		
		System.out.println(gouzi.rechercheNom("Lemaire"));
		System.out.println(gouzi.rechercheNomPrenom("Dupont", "Jennifer"));
		
	}

}
