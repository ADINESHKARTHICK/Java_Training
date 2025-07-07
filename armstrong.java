package Dinesh;
import java.util.*;
public class armstrong {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int c=0;
		while(temp!=0) {
			temp=temp/10;
			c++;
		}
		int sum=0;
		int m=n;
		while(m!=0) {
			int x=m%10;
			int p=1;
			for(int i=0;i<c;i++) {
				p=p*x;
			}
			sum=sum+p;
			m=m/10;
		}
		if(n==sum) {
			System.out.print("Armstrong Number");
		}
		else {
			System.out.print("Not an armstrong number");
		}
	}
}
