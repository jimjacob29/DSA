package pairSum;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        long arr[] = new long[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        long sum=0;
        //System.out.println(Arrays.toString(arr));
        for(int i=size-1;i>=0;i--)
        {
           sum = sum+(arr[i]*i);

           //System.out.println(sum);
        }
        System.out.print(sum);
    }
}
