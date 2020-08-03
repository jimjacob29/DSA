package Same_Substring;
import java.util.*;
import java.util.Map.Entry;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long sum=0;
        Map<String,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            String temp = "";
            for (int j = i; j < s.length(); j++)
            {
                StringBuilder sb = new StringBuilder();
                temp += s.charAt(j);
                if (hm.containsKey(temp))
                {
                    hm.replace(temp, (hm.get(temp) + 1));
                    sum = sum + hm.get(temp);

                }
                else
                {
                    hm.put(temp, 0);
                }

            }
        }
           /* for(Entry<String,Integer>entry:hm.entrySet())
            {
                if(entry.getValue()>1)
                {
                    sum = sum+(entry.getValue());
                }
            }*/
            System.out.print(sum);

    }
}
