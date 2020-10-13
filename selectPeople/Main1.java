package selectPeople;
import java.util.*;
public class Main1 {
    static long fact[] = new long[1000001];
    static long mod = 1000000007;
    static
    {
        fact[0] = 1;
        for (int i = 1; i <= 1000000; i++)
        {
            fact[i]=(fact[i-1]*i)%mod;
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int indians = sc.nextInt();
        int americans = sc.nextInt();
        long answer=0;
        for(int i=1;i<=(Math.min(indians,americans));i++)
        {
            answer = (answer+((selection(indians,i)*selection(americans,i))%mod)%mod);
        }
        System.out.print(answer%mod);
    }
    public static long  selection(int n, int r)
    {
        long result = ((((fact[n]*fermits(fact[r])%mod)*fermits(fact[n-r]))%mod));
        return result;
    }
    public static long fermits(long value)
    {
        long power = mod-2;
        long result=1;
        while(power>0)
        {
            if(power%2!=0)
            {
                result = (result*value)%mod;
                power=power-1;
            }
            else
            {
                value = (value*value)%mod;
                power=power/2;
            }
        }
        return result;
    }

}
