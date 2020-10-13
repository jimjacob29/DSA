package lexographicalRotation;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int smallest = 1000000001;
        int smallIndex=0;
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]<smallest)
            {
                smallest=arr[i];
                smallIndex=i;
            }
        }
        for(int i=0;i<size;i++)
        {
            int j=smallIndex%size;
            System.out.print(arr[j] +" ");
            smallIndex++;
        }
    }
}
