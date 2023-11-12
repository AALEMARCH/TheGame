package planete;

public class Mars extends Planete implements PlaneteExplorable {

	public Mars(String name, int population, String climat) {
		super(name, population, climat);
	}

	@Override
	public void scene(String climat) {		
		System.out.println("                                         ");
		System.out.println("Le climats de cette planete est " + climat);
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		System.out.println("--------------------- -------------------");
		System.out.println("- _   _ ----------       ----------------");
		System.out.println("- _-_-_ --------           --------------");
		System.out.println("- _   _ --------           --------------");
		System.out.println("-       ---------         ---------------");
		System.out.println("--------------------- -------------------");
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");

	}

	@Override
	public void afficher(String name, int population) {
		System.out.println("La planete " + name + " a une densité de population de " + population
				+ " habitants. Il s'agit d'une Planete qui a été ");
		explorer();
	}

	@Override
	public void explorer() {
		System.out.println("explorer an l'an 2023, elle a ensuite pu etre térraformer et habiter");

	}

}
