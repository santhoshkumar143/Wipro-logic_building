import java.util.Scanner;
public class Prgm5 {
	static void lastDigits(int n,int n1)
		{
		 if(n>9 && n1>9)
		{
			int x,y,sum=0;
			x=n%10;
			y=n1%10;
			sum =x+y;
			System.out.print("sum="+sum);
				}
	}
		public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int num1=s.nextInt();
		lastDigits(num,num1);
		}

}
