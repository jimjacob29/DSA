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
        long sum=0;
        for(int i=0;i<size;i++)
        {
            long left = leftHigh(arr,i);
            long right = rightHigh(arr,i,size);
            long valuation = left+right+(left*right)+1;
            //System.out.println(arr[i]+" "+left+" "+right+" "+valuation);
            sum=sum+(valuation*arr[i]);
        }
        System.out.print(sum);
    }
    public static long leftHigh(int arr[],int i)
    {
        long left=0;
        for(int k=i-1;k>=0;k--)
        {
            if (arr[k]>arr[i])
            {
                left++;
            }
            else if(arr[k]<=arr[i])
            {
                break;
            }
        }
        return left;
    }
    public static long rightHigh(int arr[],int i,int size)
    {
        long right=0;
        for(int k=i+1;k<size;k++)
        {
            if (arr[k]>arr[i])
            {
                right++;
            }
            else if(arr[k]<=arr[i])
            {
                break;
            }
        }
        return right;
    }
}
