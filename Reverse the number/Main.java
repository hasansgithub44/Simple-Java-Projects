import java.util.Scanner;
public class Main {
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		int number,reverse=0;
		System.out.print("Enter Number : ");
		number=scn.nextInt();
		while(number>0)
		{
			reverse=reverse*10;
			reverse=reverse+(number%10);
			number=number/10;
		}
		System.out.println("sayinin tersi : "+reverse);
	}
}