package Dinesh;

import java.util.*;

public class LCMArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int lcm = arr[0];

        for (int i = 1; i < n; i++) {
            int a = lcm;
            int b = arr[i];

            int gcd = 1;
            for (int j = 1; j <= Math.min(a, b); j++) {
                if (a % j == 0 && b % j == 0) {
                    gcd = j;
                }
            }

            lcm = (a * b) / gcd;
        }

        System.out.println(lcm);
    }
}

