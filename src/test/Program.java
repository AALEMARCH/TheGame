package test;

import planete.Jupiter;
import planete.Mars;

public class Program {

	public static void main(String[] args) {
		System.out.println(
				"Rhea s'éveilla dans le spatioport délabré, le grondement lointain de la désolation résonnant dans l'air.\nDes carcasses de vaisseaux abandonnés gisaient telles des reliques.\nSa survie dépendait d'un vaisseau opérationnel.\nNaviguant entre les ombres des hangars, elle découvrit un chasseur stellaire épargné par le ravage. \nAux commandes, Rhea fendit l'espace, traversant un système solaire post-apocalyptique. \nEntre les astéroïdes et les stations délabrées, elle traça sa route, prête à affronter l'inconnu. \nSon vaisseau était une lueur d'espoir dans l'obscurité, et elle, une étrangère naviguant dans les vestiges d'un monde oublié.");
		System.out.println("                                                   ");
		System.out.println("---------------------------------------------------");
		System.out.println("                                                   ");

		Mars mars = new Mars("Mars", 50, "seche");
		mars.afficher(mars.getName(), mars.getPopulation());
		mars.scene(mars.getClimat());

		Jupiter jupiter = new Jupiter("Jupiter", 0, "Gazeuse");
		jupiter.afficher(jupiter.getName(), jupiter.getPopulation());
		jupiter.scene(jupiter.getClimat());
		

	}

}
