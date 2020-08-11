package MaxSumArray;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0)
        {
            int size = sc.nextInt();
            int arr[] = new int[size];
            int sum = 0;
            for (int i = 0; i < size; i++)
            {
                arr[i] = sc.nextInt();
                if (arr[i] > 0)
                {
                    sum = sum + arr[i];
                }
            }
            System.out.print(sum);
        }
    }
}
