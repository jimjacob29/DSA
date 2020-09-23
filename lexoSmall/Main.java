package lexoSmall;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int smallest=125 , count=0;
        for(int i=0;i<input.length();i++)
        {
            int c = input.charAt(i);
            if(c<smallest)
            {
                smallest=c;
                count=1;
            }
            else if(c==smallest)
            {
                count++;
            }

        }
        System.out.print(count);

    }

}
