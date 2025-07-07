package Dinesh;
import java.util.*;
public class divide_digit_itself {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int count =0;
		while(n>0) {
			int x=n%10;
			if(temp%x==0) {
				count++;
			}
			n=n/10;
		}
		System.out.print(count);
	}
}
