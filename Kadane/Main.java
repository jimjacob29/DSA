package Kadane;
import java.util.*;
public class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        int result = kadane(arr);
        System.out.print(result);
    }
    public static int kadane  (int arr[])
    {
        int maxSum=Integer.MIN_VALUE , maxSumTillNow=0,maxNumber=arr[0],maxDifference=Integer.MIN_VALUE,maxDifferenceTillNow=0;
        for(int i=0;i<arr.length;i++)
        {
            maxSumTillNow = maxSumTillNow+arr[i];
            if(arr[i]>maxNumber)
            {
                maxNumber=arr[i];
            }
            maxDifferenceTillNow = maxSumTillNow-maxNumber;
            if(maxDifferenceTillNow>maxDifference)
            {
                maxDifference=maxDifferenceTillNow;
            }
            if(maxSumTillNow>maxSum)
            {
                maxSum=maxSumTillNow;
            }

            if(maxSumTillNow<0)
            {
                maxSumTillNow=0;
                maxNumber=(i==(arr.length)-1 ? arr[i]:arr[i+1]);
            }

        }
        return maxDifference;
    }
}
