import java.util.ArrayList;

public class Repertoire {

	
	ArrayList <Personne> liste = new ArrayList <Personne>();
	
public void afficheTab()
{
	int i = 0;
	
	while (i<liste.size())
	{
		System.out.println();
		i++;
	}
	
}

public void ajouterPersonne(Personne unePersonne)
{
	liste.add(unePersonne);
}

/*public String rechercheNom(String unNom)
{
	int i=0;
	while(i<liste.size())
	{
		if (liste.get(i).getNom() == unNom)
		{
	
			return();
		}
		else
		{
			i++;
		}
	}
	
}*/

public Personne rechercheNom(String nom)
{
	Personne res = null;
	for(Personne p : liste)
	{
		if (p.getNom().equalsIgnoreCase(nom))
		{
			res = p;
		}
		
	}
	return res;
}

public Personne rechercheNomPrenom(String nom, String prenom)
{
	Personne res = null;
	for(Personne p : liste)
	{
		if (p.getNom().equalsIgnoreCase(nom) && p.getPrenom().equalsIgnoreCase(prenom))
		{
			res = p;
		}
		
	}
	return res;
}



	
}
