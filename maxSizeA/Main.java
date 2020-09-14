package maxSizeA;
import java.util.*;
public class Main
{
        public static void main (String[] args)
        {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            Stack<Character> st = new Stack<>();
            for(int i=0;i<s.length();i++)
            {
                st.push(s.charAt(i));
            }
            char prev = st.pop();
            int count=0,max=0;
            if(prev=='A')
            {
                count++;
                max=count;
            }
            while(!st.empty())
            {
                char current = st.pop();
                if (current=='A' && prev=='A')
                {
                    count++;

                }
                else if(current=='A')
                {
                    count=1;
                }
                else{
                    count=0;
                }
                if(max<count)
                {
                    max = count;
                }
                prev=current;
            }
            System.out.print(max);
        }
    }
