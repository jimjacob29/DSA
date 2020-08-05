package Trailing_zeros_factorial;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long divisor =5,sum=0,quo=1;
        while(quo>=1)
        {
            quo = n/divisor;
            sum = sum+quo;
            divisor=divisor*5;
        }
        System.out.print(sum);
    }
}
