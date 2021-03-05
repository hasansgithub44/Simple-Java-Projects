import java.util.Scanner;
public class Main {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int sayi,mod,i=0;
		System.out.print("Sayiyi giriniz : ");
		sayi=obj.nextInt();
		while(sayi>0)
		{
			i++;
			mod=sayi%10;
			sayi=sayi/10;
			if(mod%3==0)
				System.out.println("\n"+i+".basamak bolunur");
			else
				System.out.println("\n"+i+".basamak bolunmez");
		}
		
	}
}
