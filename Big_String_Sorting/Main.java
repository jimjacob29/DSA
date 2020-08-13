package Big_String_Sorting;
import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String intArray[] = new String[size];
        for(int i=0;i<size;i++)
        {
            intArray[i] = br.readLine();
        }
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1; j<size;j++)
            {
                if(intArray[i].length() == intArray[j].length())
                {
                    if(intArray[i].compareTo(intArray[j])>0)
                    {
                        String temp = intArray[i];
                        intArray[i] = intArray[j];
                        intArray[j] = temp;
                    }
                }
                else if(intArray[i].length() > intArray[j].length())
                {
                    String temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<size;i++)
        {
            sb.append( intArray[i]+"\n") ;
        }
        System.out.print(sb);

    }
}