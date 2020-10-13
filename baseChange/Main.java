package baseChange;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        long changedNumber = baseChange(number);
        System.out.print(changedNumber);
    }
    public static long baseChange(long number)
    {
        if(number/9==0)
        {
            return (number%9);
        }
        return((baseChange(number/9)*10)+(number%9));
    }
}
