import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 * 
 * Une fiche contenant les caract�ristiques d'un personnage
 *
 */
public class FichePersonnage implements Fiche {
	String type;
	String nomFiche; // Le nom de la fiche
	HashMap<String, String> listeComposant;
	
	public FichePersonnage(String nom, Jeu jeu) {
		/**
		 * A la cr�ation, on donne un nom � la fiche et on charge le jeu qui servira de patron
		 */
		this.type = "fiche personnage";
		this.nomFiche = nom;
		this.listeComposant = jeu.chargerComposantPersonnage();
	}
	
	/**
	 * Permet l'affichage du nom de la fiche dans l'interface graphique 
	 */
	@Override
	public String toString() {
		return this.nomFiche;
	}

	@Override
	public HashMap<String, String> getComposants() {
		return this.listeComposant;
	}
}
