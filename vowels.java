package Dinesh;
import java.util.*;
public class vowels {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		char ch[]=a.toCharArray();
		int len=a.length();
		for(int i=0;i<len;i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') {
				System.out.println("Vowels: "+ch[i]);
			}
			else {
				System.out.println("consonant: "+ch[i]);
			}
		}
	}
}
