package Phalphabetical_order;
import java .util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String stringArr[] = new String[size];
        String convertArr[] = new String[size];
        Map<String,Integer>hm = new HashMap<>();
        for(int i=0;i<size;i++)
        {
            stringArr[i] = br.readLine();
        }
        for(int i=0;i<size;i++)
        {
            convertArr[i] = stringtoNum(stringArr[i]);
            hm.put(convertArr[i],i);
        }
        Arrays.sort(convertArr);
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<size;i++)
        {
            sb.append(stringArr[hm.get(convertArr[i])]+"\n");
        }
        System.out.print(sb);
    }
    public static String stringtoNum(String S)
    {
        String S1="";
        for(int i=0;i<S.length();i++)
        {
            switch(S.charAt(i))
            {
                case 'e':
                    S1=S1+'a';
                    break;
                case 'k':
                    S1=S1+'b';
                    break;
                case 'l':
                    S1=S1+'c';
                    break;
                case 'p':
                    S1=S1+'d';
                    break;
                case 'y':
                    S1=S1+'e';
                    break;
                case 'q':
                    S1=S1+'f';
                    break;
                case 'r':
                    S1=S1+'g';
                    break;
                case 'b':
                    S1=S1+'h';
                    break;
                case 'g':
                    S1=S1+'i';
                    break;
                case 'j':
                    S1=S1+'j';
                    break;
                case 'd':
                    S1=S1+'k';
                    break;
                case 'w':
                    S1=S1+'l';
                    break;
                case 't':
                    S1=S1+'m';
                    break;
                case 'c':
                    S1=S1+'n';
                    break;
                case 'a':
                    S1=S1+'o';
                    break;
                case 'x':
                    S1=S1+'p';
                    break;
                case 'z':
                    S1=S1+'q';
                    break;
                case 'n':
                    S1=S1+'r';
                    break;
                case 's':
                    S1=S1+'s';
                    break;
                case 'i':
                    S1=S1+'t';
                    break;
                case 'f':
                    S1=S1+'u';
                    break;
                case 'v':
                    S1=S1+'v';
                    break;
                case 'h':
                    S1=S1+'w';
                    break;
                case 'm':
                    S1=S1+'x';
                    break;
                case 'o':
                    S1=S1+'y';
                    break;
                case 'u':
                    S1=S1+'z';
                    break;

            }
        }
        return S1;

    }
}
