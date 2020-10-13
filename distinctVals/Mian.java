package distinctVals;
import java.util.*;
import java.util.Map.Entry;
public class Mian {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr [] = new int[size];
        Map<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
            if(!hm.containsKey(arr[i]))
            {
                hm.put(arr[i],1);
            }
            else
            {
                hm.replace(arr[i],(hm.get(arr[i])+1));
            }
        }
        long count=0;
        for(Entry<Integer,Integer>entry : hm.entrySet())
        {
            if(entry.getValue()>1)
            {
                count=count+(entry.getValue()-1);
            }
        }
        System.out.print(count);
    }
}
