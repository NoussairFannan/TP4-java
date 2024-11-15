public class Produit {
    public long id;
    public String nom;
    public double prix;

    public Produit(int id, String nom, double prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Nom Produit : "+nom+", Id Produit : "+id+", Prix Produit : "+prix+"\n";
    }
}
