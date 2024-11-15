public class Employe {
    public String nom;
    public String departement;
    public double salaire;

    public Employe(String nom, String departement, double salaire) {
        this.nom = nom;
        this.departement = departement;
        this.salaire = salaire;
    }
    public Employe(){}
    public String toString() {
        return "Employe{nom='" + nom + "', departement='" + departement + "', salaire=" + salaire + "}";
    }

    public String getNom() {
        return nom;
    }

    public double getSalary() {
        return salaire;
    }
}
