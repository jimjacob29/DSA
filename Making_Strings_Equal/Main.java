package Making_Strings_Equal;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int x= sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();
        int count=0;
        int value=0;
        for(int i=0;i<size;i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                count++;
                if(count%2!=0)
                {
                    value++;
                }
            }

        }
        System.out.print((x*value));
    }
}
