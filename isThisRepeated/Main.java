package isThisRepeated;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int count=0;
        String value = "No";
        int [] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<size;i++)
        {
            if(arr[i-1]==arr[i])
            {
                count++;
            }
            else
            {
                count=0;
            }
            if(count==2)
            {
                value="Yes";
                break;
            }
        }
        System.out.print(value);
    }
}
