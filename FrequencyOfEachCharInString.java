import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharInString {
    public static void main(String[] args) {

        String inputString = "java is a programming language";
        Map<Character, Long> map = inputString.chars()
                .mapToObj(c -> (char) c).
                collect(Collectors.
                        groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);
    }
}
