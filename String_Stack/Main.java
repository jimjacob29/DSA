package String_Stack;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        boolean arr[] = new boolean[s.length()];
        for(int i=0;i<s.length();i++)
        {
            boolean check = true;
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)>s.charAt(j))
                {
                    check = false;
                    break;
                }
            }
            arr[i] = check;

        }
        for (int i = 0; i <s.length(); i++)
        {
            char current = s.charAt(i);
            if(arr[i])
            {
                if(st.empty())
                {
                    sb.append(current);
                }
                else if(!st.empty() && s.charAt(st.peek())>=current)
                {
                    sb.append(current);
                }
                else
                {
                    while(!st.empty() && s.charAt(st.peek())<current)
                    {
                        sb.append(s.charAt(st.pop()));
                    }
                    st.push(i);
                }
            }
            else
            {
                while(!st.empty())
                {
                    boolean check2 = true;
                    for(int k=i+1;k<s.length();k++)
                    {
                        if(s.charAt(st.peek())> s.charAt(k))
                        {
                            check2=false;
                            break;
                        }
                    }
                    if(check2)
                    {
                        sb.append(s.charAt(st.pop()));
                    }
                    else
                    {
                        break;
                    }

                }
                st.push(i);
            }

        }
        while(!st.empty())
        {
            sb.append(s.charAt(st.pop()));
        }
        System.out.print(sb);
    }

}