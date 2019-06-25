package sample;
import java.util.Scanner;
public class Test7 {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		char c=in.next().charAt(0);
		char d=in.next().charAt(0);
		int a=c;
		int b=d;
		if(a>b)
		{
			System.out.println(d+","+c);
		}
		else
		{
			System.out.println(c+","+d);
		}
	}
}