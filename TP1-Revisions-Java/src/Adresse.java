public class Adresse {
	
	private String rue, rue2, codePostal, ville;
	
	public Adresse(String uneRue, String uneRue2, String unCP, String uneVille)
	{
		rue = uneRue;
		rue2 = uneRue2;
		codePostal = unCP;
		ville = uneVille;
	}
	
	public void affichage ()
	{
		System.out.println(rue);
		System.out.println(rue2);
		System.out.println(codePostal);
		System.out.println(ville);
		
	}
	public String toString()
	{
		String renvoie = (rue+" "+rue2+" "+codePostal+" "+ville);
		return(renvoie);
	}
	
}
