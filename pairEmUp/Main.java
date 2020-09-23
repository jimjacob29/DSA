package pairEmUp;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        int value=0;
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<size/2;i++)
        {
            int temp = arr[i]+arr[size-1-i];
            if(value<temp)
            {
                value = temp;
            }
        }
        System.out.print(value);
    }
}
