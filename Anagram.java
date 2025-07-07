package Dinesh;
import java.util.*;
public class Anagram {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String m=sc.nextLine();
		int len1=s.length();
		int len2=m.length();
		if(len1==len2) {
			char ch1[]=s.toCharArray();
			char ch2[]=m.toCharArray();
			for(int i=0;i<len1-1;i++) {
				for(int j=i+1;j<len1;j++) {
					if(ch1[i]>ch1[j]) {
						char temp1=ch1[i];
						ch1[i]=ch1[j];
						ch1[j]=temp1;
					}
				}
			}
			String b=new String(ch1);
			for(int i=0;i<len2-1;i++) {
				for(int j=i+1;j<len2;j++) {
					if(ch2[i]>ch2[j]) {
						char temp2=ch2[i];
						ch2[i]=ch2[j];
						ch2[j]=temp2;
					}
				}
			}
			String d=new String(ch2);
			if(b.equals(d)) {
				System.out.print("Anagram");
			}
			else {
				System.out.print("Not an Anagram");
			}
		}
		else {
			System.out.print("Not an Anagram");
		}
	}
}
