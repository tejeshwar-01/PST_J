import java.util.*;
import java.math.BigDecimal;

public class Task5 {

    public static String addNumberStrings(String input1, String input2) {
        BigDecimal x = new BigDecimal(input1);
        BigDecimal y = new BigDecimal(input2);
        return String.valueOf(x.add(y));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two number strings
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        // Call method and print result
        System.out.println(addNumberStrings(input1, input2));

        sc.close();
    }
}
