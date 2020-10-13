package Vowels;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int count=0;
        String s1= sc.next();
        for(int i=1;i<=size;i++)
        {
            if((i%2)==0)
            {
                if(s1.charAt(i-1)=='a'||s1.charAt(i-1)=='e'||s1.charAt(i-1)=='i'||s1.charAt(i-1)=='o'||s1.charAt(i-1)=='u')
                {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
