package String_Stack;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        Queue<Character> q = new LinkedList<>();
        for (int i = (s.length() - 1); i >= 0; i--)
        {
            char current = s.charAt(i);
            if (st.empty())
            {
                st.push(current);
            }
            else if (st.peek() < current)
            {
                q.add(current);
            }
            else st.push(current);
        }
        char a='}';
        while(!st.empty())
        {
            a=st.pop();
            System.out.print(a);
        }
        while(!(q.isEmpty()))
        {
            char b= q.remove();
            System.out.print(b);

        }
    }

}
