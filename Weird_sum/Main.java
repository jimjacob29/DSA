package Weird_sum;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long sum=0,a=1;
        for(int i=1;i<=1000;i++)
        {
            a = a*num;
            long b = 1000000000+7;
            long c = a%b;
            sum=sum+c;
        }
        System.out.print(sum);
    }
}
