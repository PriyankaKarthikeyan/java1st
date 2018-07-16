package mssd;
import java.util.*;

public class hp {
	public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        n = s.nextInt();
        if(n % 2 == 0)
        {
        	if(n>=20 && n<=30)
            System.out.println("Jerry");
        }
        else if(n%2!=0)
        {
        	if(n>=20 && n<=30)
            System.out.println("Tom ");
	}
        else
        {
        	 System.out.println("INVALID");
        }
    }


}