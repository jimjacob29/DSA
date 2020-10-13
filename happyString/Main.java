package happyString;
import java.util.*;
public class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n=1;
        long count=0;
        char arr [] = new char[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.next().charAt(0);


        }

        for(int i=0;i<size-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                n++;
                if(i==size-2)
                {
                    if(n>1)
                    {
                        count = count + (product(n) - 1 - n);
                    }
                }
            }
            else
            {
                if(n>1)
                {
                    count = count + (product(n) - 1 - n);
                }
                n=1;
            }
        }
        System.out.print(count);
    }
    public static long product(int n)
    {
        long pro =1;
        for(int i=0;i<n;i++)
        {
            pro = pro*2;
        }
        return pro;
    }
}
