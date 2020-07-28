package Triplet;
import java.util.*;
import java.util.Map.Entry;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //System.out.println((size));
        Map<Integer,Integer> hm = new HashMap<>();
        int root = (int) Math.ceil(Math.sqrt((double)size));
        //System.out.println(root);
        for(int i=0;i<=root;i++)
        {
            for(int k=0;k<=root;k++)
            {
                for(int j=0;j<=root;j++)
                {
                    int sum = (i*i)+(k*k)+(j*j);
                    if(sum<=size)
                    {
                       if(hm.containsKey(sum))
                       {
                           hm.replace(sum,(hm.get(sum)+1));
                       }
                       else
                       {
                           hm.put(sum,1);
                       }
                    }
                    else
                    {
                        break;
                    }
                }
            }
        }
        int arr[] = new int[size+1];
        for(Entry<Integer,Integer>entry : hm.entrySet())
        {
            arr[entry.getKey()] = entry.getValue();
        }
        for(int i=1;i<=size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
