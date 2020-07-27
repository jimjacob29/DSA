package Trapping_Rain_water;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum=0;
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=1;i<size-1;i++)
        {
            int max_left =arr[i] , max_right=arr[i];
            for(int j=i-1;j>=0;j--)
            {
                if(arr[j]>max_left)
                {
                    max_left = arr[j];
                }
            }
            for(int k=i+1;k<size;k++)
            {
                if(arr[k]>max_right)
                {
                    max_right = arr[k];
                }
            }
            if(max_right>max_left)
            {
                sum=sum+(max_left-arr[i]);
            }
            else if(max_right<=max_left && arr[i]!=max_left)
            {
                sum=sum+(max_right-arr[i]);
            }
        }
        System.out.print(sum);
    }
}
