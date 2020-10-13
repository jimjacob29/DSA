package three_Special_triplets;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0)
        {

            int size = sc.nextInt();
            int arr[] = new int [size];
            PriorityQueue<Integer>pq = new PriorityQueue<Integer>(new valueComparator());
            for(int i=0;i<size;i++)
            {
                arr[i] = sc.nextInt();
                pq.add(arr[i]);
            }
            int val =-1;
            for(int i=0;i<size-2;i++)
            {
                int current = arr[i];
                pq.remove(arr[i]);
                int next_next_Big = pq.remove();
                int next_Big = pq.remove();
                if(next_Big!=current && next_next_Big != current && next_Big!=next_next_Big)
                {
                    val = (Math.max(val, (current + (next_Big * next_next_Big))));
                }
                pq.add(next_Big);
                pq.add(next_next_Big);
            }
            System.out.println(val);
        }
    }

}
class valueComparator implements Comparator<Integer>{


    @Override
    public int compare(Integer o1, Integer o2) {

        if(o2>o1)
        {
            return 1;
        }
        else if(o2<o1)
        {
            return -1;
        }
        return 0;
    }
}





/*import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0)
        {
            int size = sc.nextInt();
            int arr[] = new int [size];
            for(int i=0;i<size;i++)
            {
                arr[i] = sc.nextInt();
            }
            int firstSmall[] = new int[size];
            int secondSmall[] = new int[size];
            findFirstSmall(arr,firstSmall,size);
            //System.out.println(Arrays.toString(arr));
            //System.out.println(Arrays.toString(firstSmall));
            findSecondSmall(arr,firstSmall,secondSmall,size);
            //System.out.println(Arrays.toString(secondSmall));
            int value = findValue(arr,firstSmall,secondSmall,size);
            System.out.println(value);
        }
    }
    public static void findFirstSmall(int arr[],int firstSmall[],int size)
    {

        for(int i= size-1;i>=0;i--)
        {
            int temp=-1;
            for(int j=i-1;j>=0;j--)
            {
                if(arr[j]<arr[i] && arr[j]>temp)
                {
                    temp = arr[j];
                }
            }
            firstSmall[i] = temp;
        }
    }
    public static void findSecondSmall(int[] arr,int[] firstSmall,int[] secondSmall,int size)
    {
        for(int i= size-1;i>=0;i--)
        {
            int temp=-1;
            for(int j=i-1;j>=0;j--)
            {
                if(firstSmall[j]<firstSmall[i] && firstSmall[j]>temp)
                {
                    temp = firstSmall[j];
                }
            }
            secondSmall[i] = temp;
        }
    }
    public static int findValue(int[] arr,int[] firstSmall,int[] secondSmall,int size)
    {
        int sum = -1;
        for(int i=0;i<size;i++)
        {
            if(secondSmall[i]!=-1)
            {
                int temp = ((arr[i]*firstSmall[i])+secondSmall[i]);
                if(temp>sum)
                {
                    sum = temp;
                }
            }
        }
        return sum;
    }

}*/
