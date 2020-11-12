package distinctElement;
import java.util.*;
import java.util.Map.Entry;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int window = sc.nextInt();
        int arr[] = new int[size];
        Map<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<size;i++){
            arr[i] =sc.nextInt();
        }
        int count=0;
        for(int i=0;i<window;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
                count++;
            }
            else{
                hm.replace(arr[i],(hm.get(arr[i])+1));
            }
        }
        System.out.print(count+" ");
        for(int i=window;i<size;i++){
            hm.replace(arr[i-window],hm.get(arr[i-window])-1);
            if(hm.get(arr[i-window])==0){
                count--;
                hm.remove(arr[i-window]);
            }
            if(!hm.containsKey(arr[i])){
                count++;
                hm.put(arr[i],1);
            }
            else{
                hm.replace(arr[i],(hm.get(arr[i])+1));
            }
            System.out.print(count+" ");
        }

    }
}
