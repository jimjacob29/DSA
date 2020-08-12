package MutatingArray;
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
            int target = sc.nextInt();
            int max=0;
            int arr[] = new int[size];
            for(int i = 0; i<size; i++)
            {
                arr[i] = sc.nextInt();
                if(max<arr[i])
                {
                    max = arr[i];
                }
            }
            int mid = findMid(arr,max,size,target);
            long absDiff = absolutedifference(arr,mid,target,size);
            long absDiff1 = absolutedifference(arr,mid-1,target,size);
            long absDiff2 = absolutedifference(arr,mid+1,target,size);

            if(absDiff<absDiff1 && absDiff<=absDiff2)
            {
                System.out.println(mid);
            }
            else if(absDiff2<absDiff1 && absDiff2<absDiff)
            {
                System.out.println(mid+1);
            }
            else{
                System.out.println(mid-1);
            }
        }
    }
    public static long absolutedifference(int arr[], int mid, int target , int size)
    {
        long sum = 0;
        for(int i=0; i<size;i++)
        {

            if(arr[i]>mid)
            {
                sum = sum + mid;
            }
            else
            {
                sum = sum + arr[i];
            }
        }
        return(Math.max(sum,target)-Math.min(sum,target));
    }

    public static int findMid(int arr[], int max, int size, int target)
    {
        int first = 1, last = max,mid=last;
        while(first<=last)
        {
            if(first==last)
            {
                return last;
            }
            long sum =0;
            mid=((first+last)/2);
            for(int i=0;i<size;i++)
            {
                if(arr[i]>=mid)
                {
                    sum = sum + mid;
                }
                else
                {
                    sum = sum + arr[i];
                }
            }
            if(sum>target)
            {
                last = mid-1;
            }
            else if( sum<target)
            {
                first = mid+1;
            }
            else
            {
                return mid;
            }

        }
        return mid;
    }
}
