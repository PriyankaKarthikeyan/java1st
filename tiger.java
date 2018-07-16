package mssd;
import java.util.*;

public class tiger {
	public static void main(String[] args)
	{   int evennnum=0;
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
        int sortedNumber = 0;
    for (int i = 9; i >= 0; i--) {
        int tmpNumber = a;
        int copy=a;
        while (tmpNumber > 0) {
            int digit = tmpNumber % 10;
            // Check for the greatest digit in the given number
            if (digit == i) {
                sortedNumber *= 10;
                sortedNumber += digit;
            }
            tmpNumber /= 10;
        }
    }
    System.out.println(sortedNumber); 
    
    while(a>0)
    {
    	int jj=a%10;
    	if(jj%2==0)
    	{
    		evennnum=evennnum+jj;
    	}
    	a=a/10;
    	
    }
    System.out.println("Sum of even numbers is:" +evennnum);
    if(evennnum>15)
    {
    	System.out.println("true");
    }if(evennnum<15)
    {
    	System.out.println("false");
    }
    }
	
	}


