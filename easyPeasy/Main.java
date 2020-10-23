package easyPeasy;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int even=0,odd=0;
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        if(odd>0&&even>0)
        {
            Arrays.sort(arr);
        }

        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
