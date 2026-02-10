
import java.util.Scanner;
import java.util.function.IntPredicate;

public class PerformOperationTest {

    static IntPredicate isOdd() {
        return n -> n % 2 != 0;
    }

    static IntPredicate isPrime() {
        return n -> {
            if (n <= 1) {
				return false;
			}
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
					return false;
				}
            }
            return true;
        };
    }

    static IntPredicate isPalindrome() {
        return n -> {
            int original = n, reverse = 0;
            while (n > 0) {
                reverse = reverse * 10 + n % 10;
                n /= 10;
            }
            return original == reverse;
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int choice = sc.nextInt();
            int number = sc.nextInt();

            IntPredicate op;

            switch (choice) {
                case 1:
                    op = isOdd();
                    System.out.println(op.test(number) ? "ODD" : "EVEN");
                    break;

                case 2:
                    op = isPrime();
                    System.out.println(op.test(number) ? "PRIME" : "COMPOSITE");
                    break;

                case 3:
                    op = isPalindrome();
                    System.out.println(op.test(number) ? "PALINDROME" : "NOT PALINDROME");
                    break;
            }
        }
        sc.close();
    }
}
