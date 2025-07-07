package Dinesh;
import java.util.*;
public class Frequency {
     public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
    	 String s=sc.nextLine();
    	 int len=s.length();
    	 char ch[]=s.toCharArray();
    	 int a1[]=new int[256];
    	 int ascii=0;
    	 for(int i=0;i<len;i++) {
    		 ascii=(int)(ch[i]);
    		 a1[ascii]++;
    	 }
    	 for (int i = 0; i < 256; i++) {
    		    if (a1[i] > 0) {
    		        System.out.println((char)i + " -> " + a1[i] + " times");
    		    }
    		}

     }
}
//Now we process each character:
//
//i	ch[i]	ASCII ((int)ch[i])	a1[ascii]++
//0	'h'	          104	          a1[104] = 1
//1	'e'	          101	          a1[101] = 1
//2	'l'	          108	          a1[108] = 1
//3	'l'           108	          a1[108] = 2
//4	'o'	          111	          a1[111] = 1
