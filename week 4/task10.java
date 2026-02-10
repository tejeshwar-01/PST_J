import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'matrixRotation' function below.
     *
     * The function accepts following parameters:
     *  1. 2D_INTEGER_ARRAY matrix
     *  2. INTEGER r
     */

    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int m = matrix.size();
        int n = matrix.get(0).size();

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {
            List<Integer> temp = new ArrayList<>();

            int top = layer;
            int left = layer;
            int bottom = m - layer - 1;
            int right = n - layer - 1;

            // top row
            for (int j = left; j <= right; j++)
                temp.add(matrix.get(top).get(j));

            // right column
            for (int i = top + 1; i <= bottom - 1; i++)
                temp.add(matrix.get(i).get(right));

            // bottom row
            for (int j = right; j >= left; j--)
                temp.add(matrix.get(bottom).get(j));

            // left column
            for (int i = bottom - 1; i >= top + 1; i--)
                temp.add(matrix.get(i).get(left));

            int len = temp.size();
            int rot = r % len;

            List<Integer> rotated = new ArrayList<>();
            rotated.addAll(temp.subList(rot, len));
            rotated.addAll(temp.subList(0, rot));

            int idx = 0;

            // put back top row
            for (int j = left; j <= right; j++)
                matrix.get(top).set(j, rotated.get(idx++));

            // put back right column
            for (int i = top + 1; i <= bottom - 1; i++)
                matrix.get(i).set(right, rotated.get(idx++));

            // put back bottom row
            for (int j = right; j >= left; j--)
                matrix.get(bottom).set(j, rotated.get(idx++));

            // put back left column
            for (int i = bottom - 1; i >= top + 1; i--)
                matrix.get(i).set(left, rotated.get(idx++));
        }

        // print result
        for (List<Integer> row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().trim().split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);
        int n = Integer.parseInt(firstMultipleInput[1]);
        int r = Integer.parseInt(firstMultipleInput[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                matrix.add(
                    Stream.of(bufferedReader.readLine().trim().split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        Result.matrixRotation(matrix, r);

        bufferedReader.close();
    }
}
