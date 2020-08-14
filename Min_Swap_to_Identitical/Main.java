package Min_Swap_to_Identitical;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        int b[] = new int[size];
        Map<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<size;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            b[i] = sc.nextInt();
            hm.put(b[i],i);
        }
        //System.out.println(Arrays.toString(a));
        //System.out.println(Arrays.toString(b));
        int count = 0;
        for(int i=0;i<size;i++)
        {
            if(a[i]!=b[i])
            {
                int j = hm.get(a[i]);
                int temp = b[i];
                b[i] = b[j];
                b[j] = temp;
                hm.replace(temp,j);
                hm.replace(b[i],i);
                count++;
                //System.out.print(count+" ");
                //System.out.println(Arrays.toString(b));
            }
        }
        System.out.print(count);
    }
}
