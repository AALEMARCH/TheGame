package joueur;

public abstract class Joueur {
int pv = 100;
String name;
int niveau;
int pa;

public Joueur(int pv, String name, int niveau, int pa) {
	super();
	this.pv = pv;
	this.name = name;
	this.niveau = niveau;
	this.pa = pa;
}

public int getPv() {
	return pv;
}
public void setPv(int pv) {
	this.pv = pv;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNiveau() {
	return niveau;
}
public void setNiveau(int niveau) {
	this.niveau = niveau;
}
public int getPa() {
	return pa;
}
public void setPa(int pa) {
	this.pa = pa;
}


public void afficher() {
	
}
}
