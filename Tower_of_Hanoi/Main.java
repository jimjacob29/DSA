package Tower_of_Hanoi;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        towerOfHanoi(size, 'A', 'C', 'B');
    }
    static void towerOfHanoi(int n, char from, char to, char rem)
    {
        if (n == 1)
        {
            System.out.println(n+":" +  from + "->" + to);
            return;
        }
        towerOfHanoi(n-1, from, rem, to);
        System.out.println(n + ":" +  from + "->" + to);
        towerOfHanoi(n-1, rem, to, from);
    }
}
