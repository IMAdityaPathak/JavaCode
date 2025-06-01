import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeperateOddEvenNumber {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

        System.out.println(map);

    }
}
