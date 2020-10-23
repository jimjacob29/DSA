package candyways;

import java.io.*;
import java.util.*;
public class Main {
    static long[] factorial = new long[100000001];
    static long mod = 1000000007;

    static {
        factorial[0] = 1;
        for (int i = 1; i <= 100000000; i++) {
            factorial[i] = (factorial[i - 1] * i) % mod;
        }
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long total = 1;
//        for(int i=1;i<=number;i++){
//            if(i!=A && i!=B)
//            {
//                total = (total + selection(number,i))%mod;
//            }
//        }
        //finding 2^n
        for (int i = 0; i < number; i++) {
            total = (total * 2) % mod;
        }
        long answer = total - selection(number, A) - selection(number, B);
        System.out.print(answer-1);

    }

    public static long selection(long n, long r) {
        int nVal=(int)n;
        int rVal =(int)r;
        long value = ((((fact(nVal) % mod) * (fermits(factorial[rVal]) % mod))%mod) * (fermits(fact(nVal-rVal)) % mod));
        //System.out.println(value%mod);
        return value%mod;
    }

    public static long fermits(long r) {
        long power = mod-2;
        long value=1;
        while(power>0)
        {
            if(power%2==0){
                r =(r*r)%mod;
                power=power/2;
            }
            else{
                value=(value*r)%mod;
                power=power-1;
            }
        }
        return value;

    }
    public static long fact(int number){
        long value= factorial[100000000];
        if(number<=100000000)
        {
            value= factorial[number];
        }
        else{
            for(int i=100000001;i<=number;i++)
            {
                value = (value%mod*i%mod)%mod;
            }
        }
        return value;

    }

}




//import java.io.*;
//import java.util.*;
//public class Main {
//    static long[] factorial = new long[100001];
//    static long mod = 1000000007;
//
//    static {
//        factorial[0] = 1;
//        for (int i = 1; i <= 100000; i++) {
//            factorial[i] = (factorial[i - 1] * i) % mod;
//        }
//    }
//
//    public static void main(String[] args)  {
//       Scanner sc = new Scanner(System.in);
//        long number = sc.nextLong();
//        long A = sc.nextLong();
//        long B = sc.nextLong();
//        long total = 0;
//        for(int i=1;i<=number;i++){
//            if(i!=A && i!=B)
//            {
//                total = (total + selection(number,i))%mod;
//            }
//        }
//        //finding 2^n
////        for (int i = 0; i < number; i++) {
////            total = (total * 2) % mod;
////        }
////        long answer = total - selection(number, A) - selection(number, B);
//        System.out.print(total);
//
//    }
//
//    public static long selection(long n, long r) {
//        int nVal=(int)n;
//        int rVal =(int)r;
//        long value = ((((fact(nVal) % mod) * (fermits(factorial[rVal]) % mod))%mod) * (fermits(fact(nVal-rVal)) % mod));
//        //System.out.println(value%mod);
//        return value%mod;
//    }
//
//    public static long fermits(long r) {
//        long power = mod-2;
//        long value=1;
//        while(power>0)
//        {
//            if(power%2==0){
//                r =(r*r)%mod;
//                power=power/2;
//            }
//            else{
//                value=(value*r)%mod;
//                power=power-1;
//            }
//        }
//        return value;
//
//    }
//    public static long fact(int number){
//        long value= 1;
//        for(int i=1;i<=number;i++)
//        {
//            value = (value*i)%mod;
//        }
//        return value;
//    }
//
//}
