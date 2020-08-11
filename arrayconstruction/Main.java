package arrayconstruction;
import java.util.*;
import java.util.Map.Entry;
import java.io.*;
class Main
{
    public static void main(String[] args)throws IOException
    {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size =Integer.parseInt(br.readLine());
        long value[] = new long[size];
        long frequency[] = new long[size];
        //int newArraySize = 0;
        Map<Long,Long>tm = new TreeMap<>();
        String s1[] = br.readLine().trim().split(" ");
        for(int i=0;i<size;i++)
        {
            value[i] = Long.parseLong(s1[i]);
        }
        String s2[] = br.readLine().trim().split(" ");;
        for(int i=0;i<size;i++)
        {
            frequency[i] = Long.parseLong(s2[i]);
            tm.put(value[i],frequency[i]);
        }
        long k = Long.parseLong(br.readLine());
        long sum =0;
        for(Entry<Long,Long>entry:tm.entrySet())
        {

            long add = entry.getValue();
            sum = sum+add;
            //System.out.print(entry.getValue()+" ");
            //System.out.println(sum);
            if(sum>=k)
            {
                System.out.print(entry.getKey());
                break;
            }
        }

    }
}
