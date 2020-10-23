package pairwiseProduct;
import java.io.*;
import java.math.*;
import java.util.*;


class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long mod = 1000000007;
        BigInteger bMod = new BigInteger(mod+"");
        long sum = ((N*(N+1))/2)%mod;
        BigInteger bSum = new BigInteger(sum+"");
        //System.out.println(bSum);
        BigInteger answer = new BigInteger(0+"");
        for(int i =1;i<=N;i++)
        {
            BigInteger one = new BigInteger(1+"");
            BigInteger two = new BigInteger(2+"");
            BigInteger j = new BigInteger(i+"");
            BigInteger difference = ((j.multiply(j.add(one)).divide(two))).mod(bMod);
            //System.out.println(difference);
            BigInteger value = (j.multiply(bSum.subtract(difference)).mod(bMod));;
            //System.out.print(value+" ");
            answer =(answer.add(value)).mod(bMod);
        }
        //System.out.println();
        System.out.print(answer);

    }
}
