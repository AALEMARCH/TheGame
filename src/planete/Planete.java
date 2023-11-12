package planete;

public abstract class Planete {
	String name;
	int population;
	String climat;

	public Planete(String name, int population, String climat) {
		super();
		this.name = name;
		this.population = population;
		this.climat = climat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getClimat() {
		return climat;
	}

	public void setClimat(String climat) {
		this.climat = climat;
	}

	abstract void scene(String climat);

	abstract void afficher(String name, int population);

}
