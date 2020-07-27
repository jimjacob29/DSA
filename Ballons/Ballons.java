package Ballons;
import  java.util.*;

public class Ballons {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int happy=0;
        for(int i=1;i<=size;i++)
        {
            int number = sc.nextInt();
            if(i%2 !=0)
            {
                if(number%2 != 0)
                {
                    happy++;
                }
            }
            else if(i%2==0)
            {
                if(number%2 == 0)
                {
                    happy++;
                }
            }
        }
        System.out.print(happy);
    }

}
