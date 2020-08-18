package Query_Kth_smallest;
import java.math.*;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException
    {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().trim().split(" ");
        int size = Integer.parseInt(s1[0]);
        int k = Integer.parseInt(s1[1]);
        List<Long> li = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<size;i++)
        {
            String s2[] = br.readLine().trim().split(" ");
            int type = Integer.parseInt(s2[0]);
            if(type == 1)
            {
                long x = Long.parseLong(s2[1]);
                long y = Long.parseLong(s2[2]);
                long sq = (x*x) + (y*y);
                li.add(sq);
            }
            else
            {
                Collections.sort(li);
                sb.append(li.get(k-1)+"\n");
            }
        }
        System.out.print(sb);
    }
}




/*import java.math.BigInteger;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException
    {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().trim().split(" ");
        int size = Integer.parseInt(s1[0]);
        int k = Integer.parseInt(s1[1]);
        List<BigInteger> li = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<size;i++)
        {
            String s2[] = br.readLine().trim().split(" ");
            int type = Integer.parseInt(s2[0]);
            if(type == 1)
            {
                int x = Integer.parseInt(s2[1]);
                int y = Integer.parseInt(s2[2]);
                BigInteger X = BigInteger.valueOf((x));
                BigInteger Y = BigInteger.valueOf((y));
                BigInteger sq = (X.multiply(X)).add((Y.multiply(Y)));
                li.add(sq);
            }
            else
            {
                Collections.sort(li);
                sb.append(li.get(k-1)+"\n");
            }
        }
        System.out.print(sb);
    }
    public static long square(int x , int y)
    {
       return((x*x)+(y*y));
    }
}*/
