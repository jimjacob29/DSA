package NintegerTricky;

import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int arr[] = new int[arrSize];
        long totSum=0;
        for(int i=0;i<arrSize;i++)
        {
            arr[i] = sc.nextInt();
            totSum+=arr[i];
        }
        long sumArr[] = new long[arrSize];
        sumArr[0]=arr[0];
        for(int i=1;i<arrSize;i++)
        {
            sumArr[i] = sumArr[i-1]+arr[i];
        }
        int queryNumber = sc.nextInt();
        long modulo = 1000000000+7;
        while(queryNumber-->0)
        {
            int left = sc.nextInt();
            int right = sc.nextInt();
            long leftSum = (left-2<0)? 0:sumArr[left-2];
            long rightSum = sumArr[right-1];
            long sum=totSum-(rightSum-leftSum);
            System.out.println(sum%modulo);
        }
    }
}
