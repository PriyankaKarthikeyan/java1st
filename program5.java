package mssd;
import java.util.*;
public class program5 {
	
		   int n,sum=0;
	   public void get() {
Scanner in = new Scanner(System.in);   
System.out.println("Enter a number");
n=in.nextInt();
int a[]= new int[n];
for (int i=0;i<n;i++) {
   try{
       a[i]=in.nextInt();
       sum=sum+a[i];
      Integer.parseInt(String.valueOf(a[i]));
      
   
      System.out.println("Valid");
   }
   
   catch (InputMismatchException e) {
       System.out.println("Invalid");
   }     
}
	   }
public void print() {
    System.out.println(+sum+ " ");
    	       }	   
	   public static void main(String a[]) {
    program5 f=new program5();
    f.get();
    f.print();     
}



}
