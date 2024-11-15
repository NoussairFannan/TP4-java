import javax.swing.plaf.BorderUIResource;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employe> listEmploye = new ArrayList<>();
        listEmploye.add(new Employe("Noussair", "Info", 10000));
        listEmploye.add(new Employe("Yahya", "Finance", 100));
        listEmploye.add(new Employe("Ayoub", "Math", 12000));
        int valeur=8000;

        double sumSalaire = listEmploye.stream()
                .mapToDouble(s->s.salaire).sum();
        System.out.println("La somme de salaires est :"+sumSalaire);

        System.out.println("List d'employe trie par nom :");
        listEmploye.stream()
                .sorted(Comparator.comparing(Employe::getNom))
                .forEach(System.out::println);

        Optional<Employe> employeValMin = listEmploye.stream()
                .min(Comparator.comparing(Employe::getNom));
        System.out.println("Employeur avec salaire minimale est :\n"+employeValMin.get());

        ArrayList<Employe> employeurMoinsVal =new ArrayList<>(listEmploye.stream()
                .filter(s->s.salaire>valeur)
                .collect(Collectors.toList()));
        System.out.println("Employeurs avec salaire moins de "+valeur+" sont :\n"+employeurMoinsVal);

        Optional<Employe> maxSalaryEmployee = listEmploye.stream()
                .reduce((s1, s2) -> s1.getSalary() > s2.getSalary() ? s1 : s2);
        System.out.println("Employe avec max salaire : \n"+maxSalaryEmployee.get());

        String allNames = listEmploye.stream()
                .map(Employe::getNom)  // Extraire les noms des employés
                .reduce("", (name1, name2) -> name1+name2);
        System.out.println(allNames);
    }
}