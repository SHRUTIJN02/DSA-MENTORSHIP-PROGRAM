import java.util.*;

public class Program4 {
    public static void main(String ar[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the number");
        int n = s1.nextInt();
        System.out.println("prime numbers from 1 to n are");
        for (int i = 1; i <= n; i++) {
            int flag = 0;
            if (i == 1)
                continue;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }

            }

            if (flag == 0) {
                System.out.print(i + " ");
            }

        }
    }
}
