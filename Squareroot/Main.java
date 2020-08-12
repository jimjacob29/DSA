package Squareroot;
import java.math.BigInteger;
import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0)
        {
            long number = sc.nextLong();
            long root = findRoot(number);
            System.out.println(root);
        }
    }
    public static long findRoot(long number)
    {
        BigInteger num = BigInteger.valueOf(number);
        long first=1,last = number,mid= 1;
        BigInteger middle = BigInteger.valueOf(mid);
        BigInteger value = BigInteger.valueOf(mid);
        while (first<=last)
        {
            mid = first+((last-first)/2);
            middle = BigInteger.valueOf((mid));
            value = middle.multiply(middle);
            if (value.compareTo(num)>0)
            {
                last= mid-1;
            }
            else if(value.compareTo(num)<0)
            {
                first = mid+1;
            }
            else
            {
                return mid;
            }

        }
        if(value.compareTo(num)>0)
        {
            return (mid-1);
        }
        else
        {
            return (mid);
        }
    }
}












/*import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0)
        {
            long number = sc.nextLong();
            long root = findRoot(number);
            System.out.println(root);
        }
    }
    public static long findRoot(long number)
    {
        long first=1,value=0,last = number,mid= 1;
        while (first<=last)
        {
            mid = first+((last-first)/2);
            value = mid*mid;
            if (value > number)
            {
                last= mid-1;
            }
            else if(value<number)
            {
                first = mid+1;
            }
            else
            {
                return mid;
            }

        }
        if(value>number)
        {
            return (mid-1);
        }
        else
        {
            return (mid);
        }
    }
}*/
