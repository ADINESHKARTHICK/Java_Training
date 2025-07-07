package Dinesh;
import java.util.*;
public class palindromes {
     public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
    	 int n=sc.nextInt();
    	 int a[]=new int[n];
    	 int b[]=new int[n];
    	 for(int i=0;i<n;i++) {
    		 a[i]=sc.nextInt();
    		 b[i]=a[i];
    	 }
    	 int j=n-1;
    	 for(int i=0;i<n/2;i++) {
    		 int temp=a[i];
    		 a[i]=a[j];
    		 a[j]=temp;
    		 j--;
    	 }
    	 for(int i=0;i<n;i++) {
    		 System.out.println(a[i]+" ");
    	 }
    	 int flag=0;
    	 for(int i=0;i<n;i++) {
    		 if(b[i]!=a[i]) {
    			 flag=1;
    			 break;
    		 }
    	 }
    	 if(flag==0) {
    		 System.out.println("Yes");
    	 }
    	 else {
    		 System.out.println("No");
    	 }
     }
}
