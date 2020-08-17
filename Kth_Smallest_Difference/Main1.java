package Kth_Smallest_Difference;
import java.util.*;
import java .io.*;
public class Main1
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCases-->0)
        {
            String s1[] = br.readLine().trim().split(" ");
            int size = Integer.parseInt(s1[0]);
            int K = Integer.parseInt(s1[1]);
            int arr[] = new int[size];
            String s2[] = br.readLine().trim().split(" ");
            for (int i = 0; i < size; i++)
            {
                arr[i] = Integer.parseInt(s2[i]);
            }
            Arrays.sort(arr);
            int first = 0, last =(arr[size-1]-arr[0]),mid=last;
            while(first<last)
            {
                mid = first +((last-first)/2);
                long count = pairCount(arr,mid,size,K);
                if(count<K)
                {
                    first = mid+1;
                }
                else
                {
                    last = mid;
                }

            }

            sb.append(first+"\n");
        }
        System.out.print(sb);
    }
    public static long pairCount(int arr[] , int mid,int size ,int K)
    {
        long count =0;
        for(int i=1;i<size;i++)
        {
            if(arr[i]-arr[0]<=mid)
            {
                count = count+i;
            }
            else
            {
                int first1 = 1,last1 = i,mid1=last1;
                while(first1<last1)
                {
                    mid1 = (first1+((last1-first1)/2));
                    if(arr[i]-arr[mid1]<=mid)
                    {
                        last1 = mid1;
                    }
                    else
                    {
                        first1 = mid1+1;
                    }

                }
                count = count+(i-first1);
            }
        }
        return count;
    }
}