import java.util.List;

public class MaxMinInList {
    public static void main(String[] args) {

        List<Integer> list = List.of(2, 5, 7, 9, 98, 1, 4, 6, 8, 5);
        list.stream().reduce(Integer::max).ifPresent(System.out::println);

        list.stream().reduce(Integer::min).ifPresent(System.out::println);
    }
}
