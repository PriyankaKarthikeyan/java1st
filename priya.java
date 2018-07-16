package mssd;
import java.io.*;
import java.util.*;

public class priya {
	 public static void main(String args[])
	    {
	        int n, m, a = 0,x,temp,y;
	        int ecnt=0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter any number:");
	        n = s.nextInt();
	        m = n;
	        temp=n;
	        while(n > 0)
	        {
	            x = n % 10;
	            a = a * 10 + x;
	            n = n / 10;
	        }
	        if(a == m)
	        {
	            System.out.print(""+m+" is Palindrome");
	          
	            while(temp>0)
	            {
	            	y=temp%10;
	            	if(y%2==0)
	            	{
	            		ecnt=ecnt+y;
	            	}
	            	temp=temp/10;
	            }
	            if(ecnt<25)
	            {
	            	System.out.println(" and sum of even numbers is lesser than 25");
	            }
	            if(ecnt>25)
	            {
	            	System.out.println(" and sum of even numbers is greater than 25");
	            	
	            }
	        }
	        else
	        {
	            System.out.println("Given number "+m+" is Not Palindrome");
	        }
	    }

}
