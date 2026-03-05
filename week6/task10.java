import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;

class Result {

    public static List<Integer> circularPalindromes(String s) {

        int n = s.length();
        List<Integer> result = new ArrayList<>();

        String doubled = s + s;

        for (int i = 0; i < n; i++) {

            String rotated = doubled.substring(i, i + n);
            result.add(longestPalindrome(rotated));
        }

        return result;
    }

    private static int longestPalindrome(String s) {

        int max = 1;

        for (int i = 0; i < s.length(); i++) {

            max = Math.max(max, expand(s, i, i));       // odd
            max = Math.max(max, expand(s, i, i + 1));   // even
        }

        return max;
    }

    private static int expand(String s, int left, int right) {

        while (left >= 0 && right < s.length() &&
                s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String s = bufferedReader.readLine();

        List<Integer> result = Result.circularPalindromes(s);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n")) + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
