package Resistor;
import java .util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        double sum=0.0;
        for(int i=0;i<number;i++)
        {
            double resistance = sc.nextDouble();
            sum= (double)sum+(1/resistance);
            //System.out.println(sum);
        }
        double cumResistance= 1/sum;
        //System.out.print((cumResistance));
        System.out.print(Math.floor(cumResistance));
    }
}
