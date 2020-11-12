package reverseStringSpecialCharacter;
import java.util.*;
public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int size = s1.length();
        char arr[] = new char[size];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if((s1.charAt(i)>='A'&& s1.charAt(i)<='Z') || (s1.charAt(i)>='a'&& s1.charAt(i)<='z') )
            {
                sb.append(s1.charAt(i));
            }
            else{
                arr[i] = s1.charAt(i);
            }
        }
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        int j=0;
        for(int i=0;i<size;i++){
            if((s1.charAt(i)>='A'&& s1.charAt(i)<='Z') || (s1.charAt(i)>='a'&& s1.charAt(i)<='z') )
            {
                arr[i] = sb.charAt(j);
                j++;
            }
        }
        //String s2="";
        for(int i=0;i<size;i++){
            //s2+=arr[i];
            System.out.print(arr[i]);
        }
        //System.out.print(s2);
    }
}
