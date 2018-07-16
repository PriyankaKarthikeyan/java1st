package mssd;

public class friend 
{public static void main(String[] args)
	07
{
08
    // TODO Auto-generated method stub
09

10
    String inString = new String("");              
11
    System.out.print("Enter letter: ");// get the input from the user
12
    Scanner sc = new Scanner(System.in);
13
    inString = sc.nextLine();
14

15
    if (inString.length() != 1)
16
    {
17
        System.out.println("Invalid entry.");
18
    }
19
    else if ((inString.compareTo("a") >= 0 && inString.compareTo("z") <= 0) || (inString.compareTo("A") >=  0 && inString.compareTo("Z") <= 0))
20
    {
21
        if (inString.equals("a") || inString.equals("e") || inString.equals("i") || inString.equals("o") || inString.equals("u"))
22
        {
23
            System.out.println("Thank you for the vowel " + inString);
24
        }
25
        else if (inString.equals("A") || inString.equals("E") || inString.equals("I") || inString.equals("O") || inString.equals("U"))
26
        {
27
            System.out.println(inString + " is a vowel. ");
28
        }
29
        else
30
        {
31
            System.out.println(inString + " is a consonant. ");
32
        }
33
    }
34
    else
35
    {
36
        System.out.println("Not a letter.");
37
    }
38
}


	
}
