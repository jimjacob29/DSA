package GCDofLCM;
import java.util.*;
import java.io.*;
public class optimised {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        long value[] = new long[size];
        Set<Long>st = new HashSet<>();
        String s1[] = br.readLine().trim().split(" ");
        for(int i=0;i<size;i++)
        {
            value[i] = Long.parseLong(s1[i]);
        }
        long gcdArray[] = new long[size];
        gcdArray = findgcdAll(value,size);
        for(int i=0; i<size-1;i++)
        {
            st.add((value[i]*gcdArray[i+1])/GCD(Math.max(value[i],gcdArray[i+1]),Math.min(value[i],gcdArray[i+1])));
        }
        System.out.print(findFinalGCD(st));

    }

    public static long[] findgcdAll(long arr[] , int n)
    {
        long gcdArr[] = new long[n];
        gcdArr[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            gcdArr[i] = GCD(Math.max(arr[i],gcdArr[i+1]),Math.min(arr[i],gcdArr[i+1]));
        }
        return gcdArr;

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
