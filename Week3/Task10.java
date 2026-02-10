import java.util.*;

public class Task10 {

    public static int AddSub(int input1, int input2) {
        int result = input1;
        int check = 0;

        if (input2 == 1)
            check = 1;

        for (int i = input1 - 1, j = 0; i >= 1; i--, j++) {
            if (j % 2 == check)
                result += i;
            else
                result -= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        System.out.println(AddSub(input1, input2));

        sc.close();
    }
}
