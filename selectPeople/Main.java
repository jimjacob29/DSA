package selectPeople;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long indians = sc.nextLong();
        long americans = sc.nextLong();
        long limit = Math.min(indians,americans);
        long ways = 0;
        for(int i=1;i<=limit;i++)
        {
            long waysIndian = ((factorial(indians))/(factorial(i)*factorial(indians-i)));
            long waysAmericans= ((factorial(americans))/(factorial(i)*factorial(americans-i)));
            ways = ways+((waysAmericans*waysIndian)%1000000007);
        }
        System.out.print(ways);
    }
    public static long factorial(long number)
    {
        //System.out.println(number);
        if(number<=1)
        {
            return 1;
        }
        return(number*(factorial((number-1))));
    }
}
