public class FIndFirstNOnRepeatingLetter {
    public static void main(String[] args) {

        //you need to find the first non repeating letter in "swiss"
        String str = "swiss";
        str.chars().mapToObj(i -> (char) i).filter(i -> str.indexOf(i) == str.lastIndexOf(i)).findFirst().ifPresent(System.out::println);


    }
}
