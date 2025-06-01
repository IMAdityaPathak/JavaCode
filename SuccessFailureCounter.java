import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SuccessFailureCounter {
    public static void main(String[] args) {
        String log = "There is failure in the log. The call is success.There is failure in the log. The call is success."
                + "There is failure in the log. The call is success.There is failure in the log. The call is success."
                + "There is failure in the log. The call is success.There is failure in the log. The call is success."
                + "There is failure in the log. The call is success";

        Map<String, Long> result = Arrays.stream(log.toLowerCase().split("\\W+"))
                .filter(word -> word.equals("success") || word.equals("failure"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Success count: " + result.getOrDefault("success", 0L));
        System.out.println("Failure count: " + result.getOrDefault("failure", 0L));
    }
}
