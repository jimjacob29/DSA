package subarray_minima;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long sum=0;
        for(int i=0;i<size;i++)
        {
            sum=sum+((size-i)*arr[i]);
        }
        System.out.print(sum);
    }
}
