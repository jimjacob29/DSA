package GCDofLCM;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        long value[] = new long[size];
        Set<Long>st = new HashSet<>();
        String s1[] = br.readLine().trim().split(" ");
        //System.out.println(Arrays.toString(s1));
        for(int i=0;i<size;i++)
        {
            value[i] = Long.parseLong(s1[i]);
        }
        for(int i=0; i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                st.add(LCM(value[i],value[j]));
            }
        }

        System.out.print(findFinalGCD(st));

    }
    public static long LCM(long value1 ,long value2)
    {
        long a = Math.max(value1,value2);
        long b = Math.min(value1,value2);
        //System.out.println(a+" "+b);
        //System.out.println((a*b)/GCD(a,b));
        return((a/GCD(a,b)*b));
    }
    public static long GCD(long a , long b)
    {
        if(b==0)
        {
            return a;
        }
        return(GCD(b,a%b));
    }
    public static long findFinalGCD(Set<Long>st)
    {
        long result =0;
        for(Long i :st)
        {
            result = GCD(Math.max(i,result),Math.min(i,result));
            if(result==1)
            {
                return 1;
            }
        }
        return result;
    }
}