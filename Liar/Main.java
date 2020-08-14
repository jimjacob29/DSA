package Liar;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a[] = new int[number];
        int b[] = new int[number];
        int tot[] = new int[number+1];
        for(int i=0;i<number;i++)
        {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for(int i=0;i<number;i++)
        {
            for(int j=a[i];j<=b[i];j++)
            {
                tot[j] = tot[j]+1;
            }
        }
        int value = -1;
        for(int i = number;i>=0;i--)
        {
            if(i==tot[i])
            {
                value = i;
                break;
            }
        }
        System.out.print(value);
    }
}
