package Longest_Valid_Parenthesis;
import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<s1.length();i++)
        {
            char current = s1.charAt(i);
            if(st.empty())
            {
                st.push(i);
            }
            else if(s1.charAt(st.peek())=='(' && current==')')
            {
                st.pop();
            }
            else
            {
                st.push(i);
            }
        }
        int max = s1.length()-(st.peek()+1);
        int value = st.pop();
        while(!st.empty())
        {
            int temp = value-st.peek()-1;
            if(temp>max)
            {
                max=temp;
            }
            value = st.pop();
        }
        System.out.print(max);
    }
}
