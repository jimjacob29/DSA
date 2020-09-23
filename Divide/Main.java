package Divide;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long candies = sc.nextLong();
        long people = sc.nextLong();
        if(candies%people==0)
        {
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
