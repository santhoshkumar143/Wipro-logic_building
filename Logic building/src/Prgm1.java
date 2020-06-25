import java.util.*;
public class Prgm1
{
   static void checkNum(int num)
    {
        if(num%2==0)
        System.out.print("2");
        else
        System.out.print("1");
        
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        checkNum(num);
    }
}