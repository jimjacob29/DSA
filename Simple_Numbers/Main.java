package Simple_Numbers;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        long left = sc.nextLong();
        long right = sc.nextLong();
        long k = sc.nextLong();
        long onLeft = left/k;
        long uptoRight = right/k;
        long count = uptoRight-onLeft;
        if(left%k==0)
        {
            count = count+1;
        }
        System.out.print(count);
    }
}
