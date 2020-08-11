package Missing_Two;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = (2*n)+2;
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<size-1;)
        {
            if(arr[i]==arr[i+1])
            {
                i=i+2;
            }
            else
            {
                System.out.print(arr[i]+" ");
                i++;
            }
        }
        if(arr[size-1]!=arr[size-2])
        {
            System.out.print(arr[size-1]+" ");
        }
    }
}
