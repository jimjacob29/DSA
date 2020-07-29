package TrueFalse;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String mine = sc.next();
        String friend = sc.next();
        int count=0;
        for(int i=0;i<mine.length();i++)
        {
            if(mine.charAt(i) == friend.charAt(i))
            {
                count++;
            }
        }
        if(count==mine.length())
        {
            System.out.print(k);
        }
        else if(count>=k)
        {
            int value = k+(mine.length()-count);
            System.out.print(value);
        }
        else if (count<k)
        {
            int value = count + (mine.length()-k);
            System.out.print(value);
        }
    }
}
