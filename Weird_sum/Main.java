package Weird_sum;
import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        BigInteger num = BigInteger.valueOf(number);
        long s=0,a1=1,b1 = 1000000000+7;
        BigInteger sum = BigInteger.valueOf(s);
        BigInteger a = BigInteger.valueOf(a1);
        BigInteger b = BigInteger.valueOf(b1);
        for(int i=1;i<=1000;i++)
        {
            a = a.multiply(num);
            sum=sum.add(a);
        }
        BigInteger c = sum.mod(b);
        System.out.print(c);
    }
}
