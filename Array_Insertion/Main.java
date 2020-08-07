package Array_Insertion;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0)
        {
            int size = sc.nextInt();
            int element = sc.nextInt();
            int arr[] = new int[size];
            int arr1[] = new int[size+1];
            for(int i=0;i<size;i++)
            {
                arr[i] = sc.nextInt();
                arr1[i] = arr[i];
            }
            arr1[size] = element;
            for(int i=0;i<size+1;i++)
            {
                System.out.print(arr1[i]+" ");
            }
            System.out.println();
        }
    }
}
