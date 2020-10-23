package remember;
import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long count=0;
        long number = sc.nextLong();
        long limit = (long)Math.sqrt(number);
        for(int i=1;i<=limit;i++){
            if(number%i==0){
                count+=2;
            }
            if(i==limit){
                if(i*i==number){
                    count-=1;
                }
            }
        }
        System.out.print(count);
    }
}
