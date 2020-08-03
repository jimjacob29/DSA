package Download_Time;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int speed = sc.nextInt();
        int time = (size * 8)/speed;
        System.out.print(time);
    }
}
