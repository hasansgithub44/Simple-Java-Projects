package sayiTahminOyunu;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		Random r=new Random();
		Scanner obj=new Scanner(System.in);
		int i=0,tahmin;
		int sayi=r.nextInt(10);
		 while(i==0)
		    {
		        System.out.print("\nTAHMINI GIRINIZ : ");
		        tahmin=obj.nextInt();
		        if(tahmin<sayi)
		        	System.out.print("\ntahmini arttir : ");
		        if(tahmin>sayi)
		        	System.out.print("\ntahmini azalt : ");
		        if(tahmin==sayi)
		        {
		        	System.out.print("\n-tebrikler-");
		             i++;
		        }
		    }
	}
}
