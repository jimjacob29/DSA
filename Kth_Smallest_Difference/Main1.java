package Kth_Smallest_Difference;
import java.util.*;
public class Main1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testCases =  sc.nextInt();
        while(testCases-->0) {
            int size = sc.nextInt();
            int K = sc.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i < size; i++)
            {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int first = 0, last =(arr[size-1]-arr[0]),mid=last;
            while(first<last)
            {
                mid = first +((last-first)/2);
                int count = pairCount(arr,mid,size,K);
                if(count<K)
                {
                    first = mid +1;
                }
                else
                {
                    last = mid;
                }

            }

            System.out.println(first);
        }
    }
    public static int pairCount(int arr[] , int mid,int size ,int K)
    {
        int j=0;
        int count =0;
        for(int i=0;i<size;i++)
        {
            while(j<size && arr[j]-arr[i]<=mid)
            {
                j++;
            }
            count= count+(j-i-1);
        }
        return count;
    }
}