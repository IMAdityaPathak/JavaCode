import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 4, 6, 7, 90, 9, 12, 50, 1, 7, 90);
        List<Integer> evenList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        // evenList.forEach(System.out::println);

        List<Integer> noDup = list.stream().distinct().collect(Collectors.toList());
        noDup.forEach(System.out::println);

//        String str = "java is open src";
//        str.chars().mapToObj(c->(char)c)
//                .str
    }
}
