package ocp_training.day1;

public class Etudiant {

	// attributs d'instance

	String nom;
	int age;

	// attributs de classe

	static int MAX_AGE = 39;
	// char espace = '\000';

	// méthodes d'instance

	public void info() {
		System.out.println("Nom : " + this.nom + " " + " Age : " + this.age);
	}

	// méthode de classe
	public static void getMaxAgeEtudiant() {
		System.out.println(MAX_AGE);
	}

	// Les constructeurs
	public Etudiant(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}

	public Etudiant() {
		System.out.println("constructeur");
	}

	// Les blocs d'initialisation d'instance

	{
		System.out.println("blocs d'initialisation d'instance");
	}

	// Les blocs d'initialisation de classe

	static {
		System.out.println("blocs d'initialisation de classe");
	}

}
