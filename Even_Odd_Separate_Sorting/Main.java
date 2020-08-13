package Even_Odd_Separate_Sorting;
import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int odd=-1;
        int arr[] = new int[n];
        int copyarr[]=new int[n];
        String s1[] = br.readLine().trim().split(" ");
        for(int i=0;i<n;i++)
        {
            arr[i] = Integer.parseInt(s1[i]);
            if (arr[i]%2!=0) odd++;
        }
        Arrays.sort(arr);
        int copyodd=odd,copyeven=odd+1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0||arr[i]==0)
            {
                copyarr[copyeven]=arr[i];
                copyeven++;
            }
            else
            {
                copyarr[copyodd]=arr[i];
                copyodd--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++) sb.append(copyarr[i]+ " ");
        System.out.print(sb);
    }
    /*static int[] implementMergeSort(int arr[], int start, int end)
    {
        int mid=(start+end)/2;
        if(start==end) return arr;

        implementMergeSort(arr,start,mid);
        implementMergeSort(arr,(mid+1),end);
        merge(arr,start,mid,end);
        return arr;

    }
    static void merge (int arr[],int start,int mid,int end)
    {
        int N = (mid-start)+1;
        int arr1[]=  new int[N];
        int M = end-mid;
        int arr2[] = new int[M];
        for(int i=0;i<N;i++) arr1[i]=arr[start+i];
        for(int i=0;i<M;i++) arr2[i]=arr[mid+i+1];
        int i=0, j=0,k=start;
        while(i<N && j<M)
        {
            if (arr1[i]>arr2[j])
            {
                arr[k] =arr2[j];
                j++;
                k++;
            }
            else if (arr1[i]<arr2[j])
            {
                arr[k]=arr1[i];
                i++;
                k++;
            }
            else
            {
                arr[k]=arr1[i];
                i++;
                k++;
                arr[k]=arr2[j];
                j++;
                k++;
            }

        }
        if (i>=N)
        {
            for(;j<M;j++,k++)
            {
                arr[k] = arr2[j];
            }
        }
        else if(j>=M)
        {
            for(;i<N;i++,k++)
            {
                arr[k] = arr1[i];
            }

        }
    }*/
}
