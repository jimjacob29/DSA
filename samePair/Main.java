package samePair;
import java.util.*;
import java.util.Map.Entry;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size + 1];
        int count[] = new int[100001];
        String s1[] = br.readLine().trim().split(" ");
        Map<Integer, Integer> hm = new HashMap<>();
        long totSum=0;
        for(int i = 1;i<=size;i++)

        {
            arr[i] = Integer.parseInt(s1[i-1]);
            count[arr[i]] += 1;
        }

            for(int i=1;i<=size;i++)
            {
                if(count[arr[i]]>1 &&!(hm.containsKey(arr[i])))
                {
                    hm.put(arr[i],count[arr[i]]);
                    int val = count[arr[i]];
                    totSum+=((val)*(val-1))/2;
                }
            }
            for(int i=1;i<=size;i++)
            {
                long pairCount =totSum;
                if(hm.containsKey(arr[i]))
                {
                    pairCount = pairCount - (hm.get(arr[i]) - 1);
                }
               sb.append(pairCount+" ");
            }
        System.out.print(sb);
    }
}
