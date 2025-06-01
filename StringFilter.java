import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "avocado", "grape", "apricot", "mango", "almond");

        words.stream()
                .filter(i -> i.startsWith("a"))
                .forEach(System.out::println);
    }
}
