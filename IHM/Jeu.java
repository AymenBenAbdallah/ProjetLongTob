package IHM;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * @author Theo
 *Un jeu contient les param�tres par d�faut. Il faut le voir comme une sorte de patron qui servira de mod�le pour la cr�ation de fiche par exemple.
 */
public interface Jeu {
	
	/**Permet de charger la liste des composants pour un personnage**/
	HashMap<String, String> chargerComposantPersonnage();

	/**Permet de charger la liste des composants pour un lieu**/
	HashMap<String, String> chargerComposantLieu();
}
