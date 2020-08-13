package OrangeChocolate;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int chocreq = sc.nextInt();
        int orangReq = sc.nextInt();
        int totChoc = sc.nextInt();
        int totOrang = sc.nextInt();
        int totUnkwn = sc.nextInt();
        int chocArr[] = new int[totChoc];
        int orangArr[] = new int[totOrang];
        int unkwnArr[] = new int[totUnkwn];
        for(int i=0;i<totChoc;i++)
        {
            chocArr[i] = sc.nextInt();
        }
        for(int i=0; i<totOrang;i++)
        {
            orangArr[i] = sc.nextInt();
        }
        for(int i=0; i<totUnkwn;i++)
        {
            unkwnArr[i] = sc.nextInt();
        }
        Arrays.sort(chocArr);
        Arrays.sort(orangArr);
        Arrays.sort(unkwnArr);
        int newArr[] = new int[chocreq+orangReq];
        int ptr=0;
        for(int i = totChoc-1;i>=totChoc-chocreq;i--)
        {
            newArr[ptr] = chocArr[i];
            ptr++;
        }
        for(int i = totOrang-1;i>=totOrang-orangReq;i--)
        {
            newArr[ptr] = orangArr[i];
            ptr++;
        }
        Arrays.sort(newArr);
        int nptr = totUnkwn-1;
        //System.out.print(Arrays.toString((newArr)));
        //System.out.println(Arrays.toString((unkwnArr)));
        for(int i=0;i<newArr.length;i++)
        {
            //System.out.print(unkwnArr[nptr]);
            if(nptr>=0 && newArr[i]<=unkwnArr[nptr])
            {
                newArr[i] = unkwnArr[nptr];
                //System.out.print(newArr[i]);
                nptr--;
            }
            else
            {
                break;
            }
        }
        //System.out.print(Arrays.toString((newArr)));
        long sum = 0;
        for(int i=0;i<newArr.length;i++)
        {
            sum = sum + newArr[i];
        }
        System.out.print(sum);
    }
}
