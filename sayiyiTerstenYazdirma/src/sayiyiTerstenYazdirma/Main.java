package sayiyiTerstenYazdirma;
import java.util.Scanner;
public class Main {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int sayi,ters=0;
		System.out.print("sayiyi giriniz : ");
		sayi=obj.nextInt();
		while(sayi>0)
		{
			ters=ters*10;
			ters=ters+(sayi%10);
			sayi=sayi/10;
		}
		System.out.println("sayinin tersi : "+ters);
	}
}
