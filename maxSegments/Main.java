package maxSegments;
import java.util.*;
import java.util.Map.Entry;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int segmentNumbers = sc.nextInt();
        Map<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<segmentNumbers;i++)
        {
            int leftEndPoint = sc.nextInt();
            int rightEndPoint = sc.nextInt();
            for(int j=leftEndPoint;j<=rightEndPoint;j++)
            {
                if(!hm.containsKey(j))
                {
                    hm.put(j,1);
                }
                else
                {
                    hm.replace(j ,(hm.get(j)+1));
                }
            }
        }
        int maxCount=0;
        for(Entry<Integer,Integer>entry:hm.entrySet())
        {
            if(entry.getValue()>maxCount)
            {
                maxCount=entry.getValue();
            }
        }
        System.out.print(maxCount);
    }
}
