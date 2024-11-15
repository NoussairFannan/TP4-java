import java.util.ArrayList;
import java.util.Scanner;

public class GestionProduitsApp {
    public static void main(String[] args) {
        ArrayList<Produit> listPro= new ArrayList<Produit>();
        listPro.add(new Produit(1,"phone",2000));
        listPro.add(new Produit(2,"tablette",3000));
        listPro.add(new Produit(3,"table",1000));
        listPro.add(new Produit(4,"chaire",100));
        System.out.println(listPro);
        listPro.remove(3);
        System.out.println(listPro);
        listPro.set(2, new Produit(4, "television", 4000));
        System.out.println(listPro);
        Scanner myObj = new Scanner(System.in);
        System.out.println("donner le nom du produit a rechercher");
        String nomRech = myObj.nextLine();
        for(Produit p:listPro){
            if (p.nom.equals(nomRech)) {
                System.out.println("Voici le produit : \n" + p);
                break;
            }
        }
        myObj.close();

    }
}