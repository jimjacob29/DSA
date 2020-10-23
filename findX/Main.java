package findX;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        long max=1;
        boolean over=false;
        for(int i=1;(2*number)>i*(i+1);i++){
            double a = (double) ((1.0 * number-(i * (i + 1)) / 2) / (i + 1));
            if (a-(int)a == 0.0) {
                System.out.print(a);
                long sum=0;
                int temp=0;
                int aint = (int)a;
               while(sum<number) {
                   temp++;
                   sum= sum+aint;
                   aint++;

                }
                if (temp > max) {
                    max = temp;
                } else if (max != 0 && temp < max) {
                    break;
                 }
             }
        }
        System.out.print(max);
    }
}





/*import java.io.*; // for handling input/output
        import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        long max=1;
        boolean over=false;
        for(int i=2;i<=(number/2)+1;i++){
            for(int j=0;j<i;j++){
                if(2*number==(i-j)*(i+j+1)){
                    int temp = i-j;
                    //System.out.print(temp);
                    if(temp>max){
                        max=temp;
                    }
                    else if(max!=0 && temp<max){
                        over =true;
                        break;
                    }

                }
            }
            if(over){
                break;
            }
        }
        System.out.print(max);
    }
}*/