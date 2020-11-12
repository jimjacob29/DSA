package Flips;
import java.util.*;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int count=0;
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(c>='a' && c<='z'){
                if(checkVowel(c)){
                    count++;
                }
            }
            else{
                int num = Integer.parseInt(c+"");
                if(num%2!=0){
                    count++;
                }

            }
        }
        System.out.print(count);
    }
    public static boolean checkVowel(char c){
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;

        }
    }
}
