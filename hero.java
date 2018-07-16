package mssd;
import java.util.*;
public class hero {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.print("enter the number of integers");
        int[] array = new int[input.nextInt()];
        int sum=0;

        
        for(int i = 0; i < array.length; i++)
        {
            array[i] = input.nextInt();
            
        
        }
        for(int j = 0; j < array.length; j++)
        {
           
            sum=sum+array[j];
           
        
        }
        System.out.println(+sum+ " ");
	}

}
