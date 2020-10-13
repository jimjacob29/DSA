package RGB;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int count = 0;
        List<Integer> newArr = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            if (i == size) {
                break;
            }
            for (int j = 1; j <= size; j++) {
                if (i * j <= (size - 1)) {
                    newArr.add(i * j);
                } else {
                    break;
                }
            }
        }

//        for (Integer i : newArr) {
//            System.out.print(i+" ");
//        }

        for (Integer i : newArr)
        {
            for(int j=1;j<size;j++)
            {
                if(i+j<=size)
                {
                    count++;
                }
                else
                {
                    break;
                }
            }

        }
        System.out.println(count);
    }
}
