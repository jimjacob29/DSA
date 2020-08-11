package NumberDistinct;
import java.util.*;
public class Main
{
    public static Set<Integer> st = new HashSet<>();
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int sum=0;
        while(testCases-->0)
        {

            int number = sc.nextInt();
            int limit = sc.nextInt();
            st.add(number);
            operation(number ,limit);
            int count =0;
            for(Integer i : st)
            {
                count++;
            }
            st.clear();
            System.out.println(count);
        }
    }
    public static void operation(int number,int limit)
    {
        if(limit==0)
        {
            return;
        }
        int newNumber = number + 3;
        st.add(newNumber);
        operation(newNumber,limit-1);

        newNumber = number-3;
        st.add(newNumber);
        operation(newNumber,limit-1);

        newNumber = number*2;
        st.add(newNumber);
        operation(newNumber,limit-1);
    }
}
