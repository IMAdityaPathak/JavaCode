import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortInReverseOrder {
    public static void main(String[] args) {

        List<Integer> list = List.of(2, 5, 7, 9, 98, 1, 4, 6, 8, 5);
        List<Integer> listSorted = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(listSorted);
    }
}
