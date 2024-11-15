import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> group1 = new HashSet<String>();
        HashSet<String> group2 = new HashSet<String>();
        group1.add("yahya");
        group1.add("ayoub");
        group2.add("noussair");
        group2.add("zakaria");
//        HashSet<String> grpTotal=new HashSet<String>();
//        grpTotal.addAll(group2);
//        grpTotal.addAll(group1);
//        if(grpTotal.size()==(group2.size()+group1.size())) System.out.println("Aucune intersection");
//        else{
//            System.out.println("Elements de l'intersection :");
//            for(String ele: grpTotal){
//                if(group2.contains(ele) && group1.contains(ele)) System.out.println(ele);
//            }
//        }
        HashSet<String> intersection=new HashSet<>(group1);
        intersection.retainAll(group2);
        System.out.println("Intersection des deux groupes : "+intersection);
        HashSet<String> union=new HashSet<>(group1);
        union.addAll(group2);
        System.out.println("Union des deux groupes : "+union);
    }
}