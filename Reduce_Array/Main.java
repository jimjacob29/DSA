package Reduce_Array;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int flag=0;
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        Stack<Integer>st = new Stack<>();
        Stack<Integer>temp = new Stack<>();
        for(int i=0;i<size;i++)
        {
            if(st.empty() || arr[i] == 1)
            {
                st.push(i);
            }
            else if(arr[i]==0)
            {
                int k=0,zero=0,one=0;
                while( k<2)
                {
                    if (arr[st.peek()] == 0)
                    {
                        zero++;
                        temp.push(st.peek());
                    }
                    else
                    {
                        one++;
                        temp.push(st.peek());
                    }

                        k++;
                }
                if(one==zero)
                {
                    st.push(i);
                }
                else
                {

                }
            }
        }
        System.out.print(flag);
    }
}
