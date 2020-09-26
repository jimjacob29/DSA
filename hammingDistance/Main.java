package hammingDistance;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        int count=0;
        StringBuilder sb = new StringBuilder();
        boolean entered = false;
        boolean zEntered = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != 'a' && s1.charAt(i) != 'z' &&  !entered &&!zEntered) {
                sb.append('a');
                entered = true;
            }
            else if(s1.charAt(i)  == 'z' && !zEntered &&!entered)
            {
                sb.append('a');
                zEntered = true;
            }
            else
            {
                if((count+1)==s1.length())
                {
                    int c = s1.charAt(i);
                    c++;
                    sb.append((char)c);
                }
                else
                {
                    sb.append(s1.charAt(i));
                }
                count++;
            }
        }
        System.out.print(sb);
    }
}
