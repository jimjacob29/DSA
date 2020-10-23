package findCapitals;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int size = input.length();
        for(int i=0;i<size;i++){
            char c = input.charAt(i);
            if(c>='A' && c<='Z'){
                System.out.print(c+" ");
            }
        }
    }
}
