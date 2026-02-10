import java.util.*;

public class Task8 {

    public static int SeriesN(int input1, int input2, int input3, int input4) {
        int gap1 = (input2 - input1);
        int gap2 = (input3 - input2);

        int output = input1;

        for (int i = 1; i < input4; i++) {
            if (i % 2 == 1)
                output += gap1;
            else
                output += gap2;
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();

        System.out.println(SeriesN(input1, input2, input3, input4));

        sc.close();
    }
}
