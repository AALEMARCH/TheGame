package planete;

public class Jupiter extends Planete implements PlaneteNonExplorable {

	public Jupiter(String name, int population, String climat) {
		super(name, population, climat);
	}

	@Override
	public void scene(String climat) {
		System.out.println("                                         ");
		System.out.println("Le climats de cette planete est " + climat);
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		System.out.println("--------------------- -------------------");
		System.out.println("-    _  ----------       ----------------");
		System.out.println("-    _  --------           --------------");
		System.out.println("- _  _  --------           --------------");
		System.out.println("-  __   ---------         ---------------");
		System.out.println("--------------------- -------------------");
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");

	}

	@Override
	public void afficher(String name, int population) {
		System.out.println("La planete " + name + " a une densité de population de " + population
				+ " habitants, il s'agit d'une Planete qui n'est ");
		nonExplorer();
	}

	@Override
	public void nonExplorer() {
		System.out.println(
				"pas explorable car l'atmosphere et la météorologie ne sont pas propice a une forme de vie...");

	}

}
