import java.util.Scanner;

public class Prgm4 {
	public static void secLastDigit(int n)
	{
		int x,y,z;
		if(n>=9)
		{
			x=n%100;
			y=x/10;
			z=Math.abs(y);
			System.out.print(z);
		}
		else
		{
			System.out.println("-1");
		}
		
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		secLastDigit(num);
		
		

	}

}
