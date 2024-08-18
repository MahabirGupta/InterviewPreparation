import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().forEach(System.out::println);

        System.out.println();
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        numbers1.parallelStream().forEach(System.out::println);


    }
}
