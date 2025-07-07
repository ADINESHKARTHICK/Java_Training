package Dinesh;
import java.util.*;

public class magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int n = num;
        while (n > 9) {
            int sum = 0;
            while (n > 0) {
               int x = n % 10;
               sum=sum+x;
                n /= 10;
            }
            n = sum;
        }

        if (n == 1)
            System.out.println(num + " is a Magic Number");
        else
            System.out.println(num + " is Not a Magic Number");
    }
}

