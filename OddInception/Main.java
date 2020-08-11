package OddInception;

import java.util.*;
import java.io.*;
class Main
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String s1[] = br.readLine().trim().split(" ");
        if (size%2==0) System.out.print("NO");
        else{
            long arr[] = new long[size];
            for(int i=0;i<size;i++)
            {
                arr[i] =Long.parseLong(s1[i]);
                if (arr[0]%2==0)
                {
                    System.out.print("NO");
                    break;
                }
                else if(i==size-1)
                {
                    if (arr[i]%2==0)
                    {
                        System.out.print("NO");
                        break;
                    }
                    else System.out.print("YES");
                }
            }
        }
    }
}
