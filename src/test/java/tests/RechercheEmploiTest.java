package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DetailOffrePage;
import pages.RandstadHomePage;
import pages.ResultatOffresPage;

public class RechercheEmploiTest extends TestBase

{
	
	/*
	 * 1- Taper « boulanger » dans la barre de recherche
	 * 2- Sélectionner région « Bretagne » dans la liste déroulante "région et département"
	 * 3- Valider la recherche 
	 * 4- Cliquer sur "Voir l'offre" du premier résultat affiché
	 * 5- Vérifier la présence des textes "niveau d'études", "salaire minimum", "type de salaire"
	 */

	RandstadHomePage homeObject;
	ResultatOffresPage offreObject;
	DetailOffrePage detailObject;


	@Test
	public void UtilisateurChercherOffre()
	{
		
		try {

		// 1 | Taper « boulanger » dans la barre de recherche

		homeObject = new RandstadHomePage(driver);
		homeObject.taperQualification("boulanger");

		// 2 | Sélectionner région « Bretagne » dans la liste déroulante "région et département"

		homeObject = new RandstadHomePage(driver);
		homeObject.selectionnerLocation();

		// 3 | Valider la recherche

		homeObject = new RandstadHomePage(driver);
		homeObject.validerRecherche();

		// 4 | Cliquer sur "Voir l'offre" du premier résultat affiché.

		offreObject = new ResultatOffresPage(driver);
		offreObject.afficherOffrePage();

		// 5 | Vérifier la présence des textes "niveau d'études", "salaire minimum", "type de salaire"

		detailObject = new DetailOffrePage(driver);
		detailObject.veriferTextOffre();

		Assert.assertTrue(detailObject.TextDetail.getText().contains("niveau d'études : Sans Diplôme\n" + 
				"salaire minimum : 10.86 €\n" + 
				"type de salaire : Mensuel"));
		
		} catch (Exception e) {
			System.out.println("Error occurred  " + e.getMessage());
		}

	}
}
