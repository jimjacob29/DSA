package Three_Products;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException
    {
        //Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        long zero=0,positive=0,negative=0;
        long arr[] = new long[size];
        String s1[] = br.readLine().trim().split(" ");
        for(int i=0;i<size;i++)
        {
            arr[i] = Integer.parseInt(s1[i]);
            if(arr[i]==0)
            {
                zero++;
            }
            else if(arr[i]>0)
            {
                arr[i]=1;
                positive++;
            }
            else if(arr[i]<0)
            {
                arr[i]=-1;
                negative++;
            }
        }
        for(int i=0;i<size;i++)
        {
            long product =arr[i];
            for(int j=i+1;j<size;j++)
            {
                product = product * arr[j];
                if(product==0)
                {
                    zero++;
                }
                else if(product>0)
                {
                    positive++;
                }
                else if(product<0)
                {
                    negative++;
                }
            }
        }
        System.out.print(negative+" "+zero+" "+positive);
    }
}
