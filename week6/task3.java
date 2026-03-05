## Problem Link
[Compare the Triplets - HackerRank](https://www.hackerrank.com/challenges/compare-the-triplets/problem)
  
import java.io.*;
import java.util.*;

class Result {

    public static String twoStrings(String s1, String s2) {

        HashSet<Character> set = new HashSet<>();

        for (char c : s1.toCharArray()) {
            set.add(c);
        }

        for (char c : s2.toCharArray()) {
            if (set.contains(c)) {
                return "YES";
            }
        }

        return "NO";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < q; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            System.out.println(Result.twoStrings(s1, s2));
        }

        sc.close();
    }
}
