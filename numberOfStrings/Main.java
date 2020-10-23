package numberOfStrings;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long mod = 1000000007;
        long product = 1;
        for(int i=0;i<N-2;i++)
        {
            product = (product * 26)%mod;
        }
        long answer = ((((N%mod)*((N-1)%mod))%mod)*(product%mod))%mod;
        System.out.print(answer);
    }
}
