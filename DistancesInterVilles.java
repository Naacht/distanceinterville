package MonPackage;

public class DistancesInterVilles 
{
	public static void main(String[] args) 
	{
		//D�claration des variables
		int Distance, H, I, J;
		String VilleDeDepart, VilleDArrivee;
		boolean Boucle;
		String Ville [] = {"Brest", "Grenoble", "Lille", "Lyon", "Marseille", "Nantes", "Paris", "Rennes", "Strasbourg", "Toulouse"};
		int Mat [][] = { {0, 996, 723, 890, 1286, 305, 564, 245, 1026, 884}, {0, 0, 750, 104, 286, 711, 576, 747, 505, 543},
		{0, 0, 0, 668, 979, 593, 224, 515, 524, 905}, {0, 0 , 0, 0, 316, 607, 472, 645, 434, 467}, {0, 0, 0, 0, 0, 890, 769, 938, 750, 400},
		{0, 0, 0, 0, 0, 0, 386, 106, 832, 559}, {0, 0, 0, 0, 0, 0, 0, 348, 447, 681}, {0, 0, 0, 0, 0, 0, 0, 0, 799, 655},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 901}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0} };
		
		//Affichage des villes dont les distances peuvent �tre calcul�es entre elles
		System.out.println("Liste des villes disponibles :");
		for (H = 0; H <= 9 ; H++)
		{
			System.out.print(Ville[H] + " | ");
		}
		System.out.println("");
		System.out.println("");
		 
		//Saisie et contr�le de saisie de la ville de d�part
		Boucle = true;
		I = 0;

		while (Boucle == true)
		{
		    VilleDeDepart = Saisie.lire_String("Veuillez saisir une ville de d�part :");
		    while ((I < 10) && (VilleDeDepart.equals (Ville[I])== false ))
		    { 
		    	I++;
		    }
		    if (I == 10)
		    {
		    	System.out.println("La ville " + VilleDeDepart + " n'existe pas dans notre base de donn�es ou est mal ortographi�e");
		    	I = 0;
		    }
	        else
	        {
	        	Boucle = false;
	        }
		}
		System.out.println("");
		
		//Saisie et contr�le de saisie de la ville d'arriv�e
		Boucle = true;
		J = 0;
		
		while (Boucle == true)
		{
		    VilleDArrivee = Saisie.lire_String("Veuillez saisir une ville d'arriv�e :");
		    while ((J < 10) && (VilleDArrivee.equals (Ville[J])== false ))
		    { 
		    	J++;
		    }
		    if (J == 10)
		    {
		    	System.out.println("La ville " + VilleDArrivee + " n'existe pas dans notre base de donn�es ou est mal ortographi�e");
		    	J = 0;
		    }
	        else
	        {
	        	Boucle = false;
	        }
		}
		System.out.println("");
		
		//R�cup�ration de la distance entre les deux villes dans la matrice � l'aide de la position des villes dans le vecteur Ville
		if (I<J) Distance = Mat[I][J]; else Distance = Mat[J][I];
		
		//Affichage de la distance
		System.out.println("La distance qui s�pare " + Ville[I] + " de " + Ville[J] + " est de " + Distance + " kilom�tres");
	}
}