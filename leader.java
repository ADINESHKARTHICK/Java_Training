package Dinesh;
import java.util.*;
public class leader {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[n-1];
		System.out.print(max+" ");
		for(int i=n-2;i>=0;i--) {
			if(a[i]>max) {
				max=a[i];
				System.out.print(max+" ");
			}
		}
	}
}
