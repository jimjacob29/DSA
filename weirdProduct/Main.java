package weirdProduct;
import java.util.*;
public class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        long firstLeft = sc.nextInt();
        long firstRight = sc.nextInt();
        long secondLeft = sc.nextInt();
        long secondRight = sc.nextInt();
        long sum[] = new long[4];
        sum[0] = firstLeft*secondLeft;
        sum[1] = firstLeft*secondRight;
        sum[2] = firstRight*secondLeft;
        sum[3] = firstRight*secondRight;
        long largest = sum[0];
        for(int i=1;i<4;i++)
        {
            if(sum[i]>largest)
            {
                largest=sum[i];
            }
        }
        System.out.print(largest);
    }
}
