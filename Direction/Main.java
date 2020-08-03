package Direction;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        if(x1==x2 && y1<y2)
        {
            System.out.print("North");
        }
        else if(x1==x2 && y1>y2)
        {
            System.out.print("South");
        }
        else if(y1==y2 && x1<x2)
        {
            System.out.print("East");
        }
        else if(y1==y2 && x1>x2)
        {
            System.out.print("West");
        }
        else if(y2>y1 && x2>x1)
        {
            System.out.print("North East");
        }
        else if(y2<y1 && x2>x1)
        {
            System.out.print("South East");
        }
        else if(x2<x1 && y2<y1)
        {
            System.out.print("South West");
        }
        else
        {
            System.out.print("North West");
        }
    }
}
