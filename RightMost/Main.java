package RightMost;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] =sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            int value = arr[i];
            for(int j=size-1;j>=i;j--)
            {
                if(arr[i]<=arr[j])
                {
                    System.out.print((j+1)+" ");
                    break;
                }
            }
        }
    }
}
