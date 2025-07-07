package Dinesh;
import java.util.*;

public class swap_non_vowels {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        int i = 0;
        int j = ch.length - 1;

        while (i < j) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ||
                ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                i++;
                continue;
            }
            if (ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u' ||
                ch[j] == 'A' || ch[j] == 'E' || ch[j] == 'I' || ch[j] == 'O' || ch[j] == 'U') {
                j--;
                continue;
            }
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;
        }

        System.out.println(new String(ch));
    }
}
