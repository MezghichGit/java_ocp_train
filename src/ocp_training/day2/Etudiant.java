package ocp_training.day2;

public class Etudiant {
	String nom;
    int age;
    double moyenne;

    public Etudiant(String nom, int age, double moyenne) {
        this.nom = nom;
        this.age = age;
        this.moyenne = moyenne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    @Override
    public String toString(){
        return "nom: " + this.nom + ", age: " + this.age + ", moyennne: "+ this.moyenne ;
    }
}
