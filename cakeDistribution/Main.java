package cakeDistribution;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long pieces = sc.nextLong();
        int peoples = sc.nextInt();
        int flag = 0;
        for(int i = peoples;i>1;i--)
        {
            //System.out.print(i);
            //System.out.print(pieces/i);
            if (pieces%i == 0) {
                //System.out.print("Entered");
                flag = 1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.print("No");
        }
        else
        {
            System.out.print("Yes");
        }
    }
}
