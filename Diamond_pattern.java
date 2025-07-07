package Dinesh;
import java.util.*;
public class pattern {
	public static void main(String args[]) {

	     Scanner sc=new Scanner(System.in);
	     int n =sc.nextInt();
	     for(int i=0;i<n;i++) {
	    	 for(int j=1;j<n-i;j++ ) {
	    		 System.out.print(" ");
	    	 }
	    	 for(int k=0;k<=i;k++) {
	    		 System.out.print("* ");
	    	 }
	    	 
	    	 System.out.println();
	     }
	     for(int i=n-2;i>=0;i--) {
	    	 for(int j=1;j<n-i;j++ ) {
	    		 System.out.print(" ");
	    	 }
	    	 for(int k=0;k<=i;k++) {
	    		 System.out.print("* ");
	    	 }
	    	 
	    	 System.out.println();
	     }
	}
}
