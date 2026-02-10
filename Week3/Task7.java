import java.util.*;

public class Task7 {

    // Method to find Nth prime
    public static int NthPrime(int input1) {
        int count = 0; // how many primes found
        int number = 2; // candidate number to test

        while (true) {
            if (isPrime(number)) {
                count++;
                if (count == input1) {
                    return number; // found nth prime
                }
            }
            number++;
        }
    }

    // Helper to check if number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // input N
        System.out.println(NthPrime(n));

        sc.close();
    }
}
