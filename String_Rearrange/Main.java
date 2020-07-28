package String_Rearrange;

import java.util.*;
import java.util.Map.Entry;;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<Character,Long> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='a'|| c=='b'|| c=='c'|| c=='d')
            {
                if(hm.containsKey(c))
                {
                    hm.replace(c,((hm.get(c))+1));
                }
                else
                {
                    hm.put(c,Long.valueOf(1));
                }
            }
        }
        long min=10000000;
        long count =0;
        for(Entry<Character,Long>entry:hm.entrySet())
        {
            long current =0;
            count++;
            if(entry.getKey()=='a')
            {
                current =(entry.getValue()/2);


            }
            else if(entry.getKey()=='b'|| entry.getKey()=='c'|| entry.getKey()=='d')
            {
                current = entry.getValue();
            }
            if(current<min)
            {
                min=current;
            }
        }
        if(count!=4) System.out.print(0);
        else System.out.print(min);
    }
}
