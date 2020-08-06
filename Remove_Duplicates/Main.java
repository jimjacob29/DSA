package Remove_Duplicates;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = n+1;
        Set<Integer>st = new LinkedHashSet<>();
        for(int i =0;i<size;i++)
        {
            int num = sc.nextInt();
            st.add(num);
        }
        for(Integer i : st)
        {
            System.out.print(i+" ");
        }
    }
}
