package Lexiographical_permutations;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if(size>4)
        {
            for(int i=1;i<=size;i++)
            {
                if(i==size)
                {
                    System.out.print((size-3)+" ");
                }
                else if(i==(size-3))
                {
                    System.out.print(size+" ");
                }
                else
                {
                    System.out.print(i+" ");
                }
            }
        }
        else if(size<=4)
        {
            for (int i = 0; i <= size; i = i + 3)
            {
                if (i + 1 <= size)
                {
                    System.out.print((i + 1) + " ");
                }
                if (i + 3 <= size)
                {
                    System.out.print((i + 3) + " ");
                }
                if (i + 2 <= size)
                {
                    System.out.print((i + 2) + " ");
                }
                else break;
            }
        }
    }
}
