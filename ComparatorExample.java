import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {


        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);        //(x < y) ? -1 : ((x == y) ? 0 : 1);
            }
        };
        System.out.println(comparator.compare(3, 2));

        Comparator<Integer> comparator1 = (a, b) -> a.compareTo(b);
        System.out.println("Result of the comparator using lambda is :" + comparator1.compare(3, 2));
    }
}
