package array_element_2d;

import java.util.*;
import java.io.*;
class Main
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().trim().split(" ");
        int row = Integer.parseInt(s1[0]);
        int coloumn = Integer.parseInt(s1[1]);
        int testCases = Integer.parseInt(s1[2]);
        int k=0;
        Map<Integer,Integer>hm = new HashMap<>();
        for(int i=0; i<row;i++)
        {
            String s2[] = br.readLine().trim().split(" ");
            for(int j=0;j<coloumn;j++)
            {
                k= Integer.parseInt(s2[j]);
                hm.put(k,1);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (testCases-->0)
        {
            int search = Integer.parseInt(br.readLine());
            if(hm.containsKey(search))
            {
                sb.append("Yes\n");

            }
            else{
                sb.append("No\n");

            }
        }
        System.out.print(sb);
    }
}
