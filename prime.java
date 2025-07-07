package Dinesh;
import java.util.*;
public class prime {
     public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
    	 int n=sc.nextInt();
    	 int count=0;
    	 if(n<=1) {
    		 System.out.print("Its not a prime number");
    	 }
    	 else {
    		 for(int i=2;i<n;i++) {
    			 if(n%i==0) {
    				 count++;
    			 }
    		 }
    	 }
    	 if(count==0) {
    		 System.out.print("prime");
    	 }
    	 else {
    		 System.out.print("Is not prime");
    	 }
     }
}
