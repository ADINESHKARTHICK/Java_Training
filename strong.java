package Dinesh;
import java.util.*;
public class strong {
     public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
    	 int n=sc.nextInt();
    	 int temp=n;
    	
    	 int sum=0;
    	 
    	 while(temp!=0) {
    		 int x=temp%10;
    		 temp=temp/10;
    		 int p=1;
    		 for(int i=2;i<=x;i++) {
    			 p=p*i;
    		 }
    		 sum=sum+p;
    	 }
    	 
    	 
    	 if(n==sum) {
    		 System.out.print("yes");
    	 }
    	 else {
    		 System.out.print("No");
    	 }
     }
}
