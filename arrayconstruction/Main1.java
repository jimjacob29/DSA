package arrayconstruction;
import java.util.*;
class Number
{
    int num;
    int freq;
    Number(int num,int freq)
    {
        this.num = num;
        this.freq = freq;
    }
}
public class Main1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numb[] = new int[size];
        int frequency[] = new int[size];
        Number arr[] = new Number[size];
        for(int i=0;i<size;i++)
        {
            numb[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            frequency[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            arr[i] = new Number(numb[i],frequency[i]);
        }
        Arrays.sort(arr, (a,b) -> a.num-b.num);
        int k = sc.nextInt();
        int i= 0;
        while(k>0)
        {
            k= k-(arr[i].freq);
            i++;
        }
        System.out.print(arr[i-1].num);
    }

}
