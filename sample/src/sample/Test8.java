package sample;
import java.util.Scanner;
public class Test8 {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		char c=in.next().charAt(0);	
		if(c>=0)
    		{
        		System.out.print("Digit");

    		}
    		else if((c>='a' && c<='z')||(c>='A' && c<='Z'))
    		{
        		System.out.print("Alphabet");
    		}
    		else
    		{
        		System.out.print("Special Character");

    		}
	}

}
