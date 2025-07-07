package Dinesh;
import java.util.*;
public class swap_letters {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String w[]=s.split("\\s");
		int len=w.length;
		int j=len-1;
		for(int i=0;i<len/2;i++) {
			String temp=w[i];
			w[i]=w[j];
			w[j]=temp;
			j--;
		}
		for(int i=0;i<len;i++) {
			System.out.print(w[i]);
		}
	}
}
