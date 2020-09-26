package subarray;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int firstArraySize = sc.nextInt();
        int secondArraySize = sc.nextInt();
        int firstArray[] = new int[firstArraySize];
        int secondArray[] = new int[secondArraySize];
        for(int i=0;i<firstArraySize;i++)
        {
            firstArray[i] = sc.nextInt();
        }
        for(int i=0;i<secondArraySize;i++)
        {
            secondArray[i] = sc.nextInt();
        }
        int max =secondArraySize;
        for(int i=0;i<=firstArraySize-secondArraySize;i++)
        {
            int count=0;
            int temp=i;
            for(int j=0;j<secondArraySize;j++)
            {
                if(firstArray[temp++]!=secondArray[j])
                {
                    count++;
                }
            }
            if(count<max)
            {
                max=count;
            }
            if(count == 0)
            {
                max=0;
                break;
            }
        }
        System.out.print(max);
    }
}
