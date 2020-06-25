import java.util.Scanner;

public class Prgm3 {
	static int lastDigit(int n)
		{
		 n=n%10;
		if(n<=10)
		{
			n*=-1;
		}
			return n;
		}
		public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		lastDigit(num);
		System.out.print(lastDigit(num));

	}

}
