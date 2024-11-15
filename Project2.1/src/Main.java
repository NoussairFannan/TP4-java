import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Java", "Stream", "Example", "String","PO");
        List<String> filteredList_a = stringList.stream()
                .filter(s -> !s.contains("a"))
                .collect(Collectors.toList());
        List<String> filteredList_3_rev = stringList.stream()
                .filter(s -> s.length()<3)
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.toList());
        List<String> filteredList_e = stringList.stream()
                .filter(s -> !s.contains("e"))
//                .flatMap(s -> s.chars().mapToObj(c -> String.valueOf((char) c)))
                .flatMap(s-> Arrays.stream(s.split("")))
                .collect(Collectors.toList());
        List<String> majusculeList = stringList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        List<Integer> longueurList = stringList.stream()
                .map(String::length)
                .collect(Collectors.toList());
        List<String> characterList = stringList.stream()
//                .flatMap(s->s.chars().mapToObj(c -> String.valueOf((char) c)))
                .flatMap(s-> Arrays.stream(s.split("")))
                .collect(Collectors.toList());
        List<String> indexList = IntStream.range(0, stringList.size())
                .mapToObj(i -> stringList.get(i) + " - " + i)
                .collect(Collectors.toList());
        System.out.println(stringList);
        System.out.println(filteredList_a);
        System.out.println(filteredList_3_rev);
        System.out.println(filteredList_e);
        System.out.println(majusculeList);
        System.out.println(longueurList);
        System.out.println(characterList);
        System.out.println(indexList);
    }
}