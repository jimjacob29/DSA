package Max_ones;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int m = sc.nextInt();
        Queue<Integer>q= new LinkedList<>();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        int zero=0,front=0,back=0,max=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==0)
            {
                q.add(i);
                zero++;
                if(zero==m+1 &&q.peek()!=null)
                {
                    front =i;
                    int length=front-back;
                    if(length>max)
                    {
                        max=length;
                    }
                    back=q.peek()+1;
                    q.remove();
                    zero--;
                }

            }
        }
        int length = size-back;
        if(length>max)
        {
            max = length;
        }
        System.out.print(max);
    }
}
