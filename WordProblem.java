import java.util.List;
import java.util.stream.Collectors;

public class WordProblem {
    public static void main(String[] args) {

        //You have list of words .Group the words by their first letter and count how many words
        //start with each letter.
        //
        //input : apple, mango, appricot, blueberry
        //output:-  {a=2,b=1,m=1}
        List<String> words = List.of("apple", "mango", "apricot", "blueberry");

        words.stream().collect(Collectors.groupingBy(word -> word.charAt(0), Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " : " + v));


    }
}
