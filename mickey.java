package mssd;
import java.util.*;


public class mickey {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String inString;				
		System.out.print("Enter letter: ");// get the input from the user
		Scanner sc = new Scanner(System.in);
		inString = sc.nextLine();
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;

        inString = inString.toLowerCase();
        for(int i = 0; i < inString.length(); ++i)
        {
            char ch = inString.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                System.out.print("vowel ");
            }
            else if((ch >= 'a'&& ch <= 'z')) {
            	System.out.print("consonent ");
            }
            else
            {
            	System.out.print("not_a_letter");
            }
        }
	}
       
}
