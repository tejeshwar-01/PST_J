import java.util.*;

public class Task6 {

    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;

        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }

        // Sort indices based on heights in descending order
        Arrays.sort(idx, (a, b) -> heights[b] - heights[a]);

        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = names[idx[i]];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] names = new String[n];
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            heights[i] = sc.nextInt();
        }

        String[] sortedNames = sortPeople(names, heights);

        for (String name : sortedNames) {
            System.out.println(name);
        }

        sc.close();
    }
}
