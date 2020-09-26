package NintegerEasy;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int arr[] = new int[arrSize];
        for(int i=0;i<arrSize;i++)
        {
            arr[i] = sc.nextInt();
        }
        int queryNumber = sc.nextInt();
        long modulo = 1000000000+7;
        while(queryNumber-->0)
        {
            int left = sc.nextInt();
            int right = sc.nextInt();
            long sum=0;
            for(int i=0;i<arrSize;i++)
            {
                if(i<left-1 || i>=right)
                {
                    sum+=arr[i];
                }
            }
            System.out.println(sum%modulo);
        }
    }
}
