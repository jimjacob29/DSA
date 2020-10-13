package longestSubString;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int replaceable = sc.nextInt();
        String s1 = sc.next();
        int max=0;
        for(int i=0;i<size;i++)
        {
            int count=0;
            int r = replaceable;
            for(int j=i;j<size;j++)
            {
                if(s1.charAt(j)=='a'||s1.charAt(j)=='e'||s1.charAt(j)=='i'||s1.charAt(j)=='o'||s1.charAt(j)=='u')
                {
                    count++;
                }
                else if(r>0)
                {
                    count++;
                    r--;
                }
                else
                {
                    break;
                }
            }
            if(count>max)
            {
                max=count;
            }
        }
        System.out.print(max);
    }
}
