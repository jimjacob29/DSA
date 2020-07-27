package Trapping_Rain_water;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int left[] = new int[size];
        int right[] = new int[size];
        int max =0;
        int sum=0;
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<size-1;i++)
        {
            if(arr[i-1]>max)
            {
                max=arr[i-1];
            }
            left[i] = max;
        }
        int max1 =0;
        for(int i=size-2;i>0;i--)
        {
            if(arr[i+1]>max1)
            {
                max1=arr[i+1];
            }
            right[i] = max1;

        }
        for(int i=1;i<size-1;i++)
        {
            if(right[i]>left[i] && left[i]>arr[i])
            {
                sum=sum+(left[i]-arr[i]);
            }
            else if(right[i]<=left[i] && right[i]>arr[i] && arr[i]!=right[i])
            {
                sum=sum+(right[i]-arr[i]);
            }
        }
        System.out.print(sum);
    }
}
