
public class Personne {

	private String nom, prenom, telephone;
	private Adresse adresse;
	


public Personne(String unNom, String unPrenom, Adresse uneAdresse, String unTelephone)
{
	nom = unNom;
	prenom = unPrenom;
	telephone = unTelephone;
	adresse = uneAdresse;
}

public void affichage()
{
	System.out.println(nom);
	System.out.println(prenom);
	System.out.println(adresse);
	System.out.println(telephone);
}

public String toString()
{
	String renvoie = (nom+" "+prenom+" "+adresse+" "+telephone);
	return(renvoie);
}

public String getNom()
{
	return (nom);
}

public String getPrenom()
{
	return (prenom);
}


	

	
	
}
