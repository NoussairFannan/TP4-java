import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> notEtud = new HashMap<String, Integer>();
        notEtud.put("Yahya",10);
        notEtud.put("Noussair",12);
        notEtud.put("Zakaria",11);
        notEtud.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
        System.out.println("-----------------------");
        int addInt=5; //note a ajouter
        notEtud.put("Noussair",notEtud.get("Noussair")+addInt);
        notEtud.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
        System.out.println("-----------------------");
        notEtud.remove("Zakaria");
        notEtud.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
        System.out.println("-----------------------");
        System.out.println("Taille de hashmap est : "+notEtud.size());
        System.out.println("min : "+Collections.min(notEtud.values()));
        System.out.println("max : "+Collections.max(notEtud.values()));
        int somme=0;
        boolean note20=false;
        for (int ele:notEtud.values()){
            somme+=ele;
            note20=true;
        }
        System.out.println("average : "+somme);
        if(!note20) System.out.println("Une note égale à 20.");
        else System.out.println("Aucune note égale à 20.");

    }
}