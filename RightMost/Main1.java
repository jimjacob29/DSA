package RightMost;
import java.util.*;
import java.io.*;
public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String input[] = br.readLine().trim().split(" ");
        int number[] = new int[size];
        int max[] = new int[size];
        int ans[] = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = Integer.parseInt(input[i]);
        }
        max[size-1] = number[size-1];
        for(int i=size-2;i>=0;i--)
        {
            max[i] = Math.max(number[i],max[i+1]);
        }
        //System.out.print(Arrays.toString(max));
        for(int i=0;i<size;i++)
        {
            int low=i;
            int high = size-1;
            while(low<=high)
            {
                int mid= low+((high-low)/2);
                if(number[i]<=max[mid])
                {
                    ans[i] = mid;
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            System.out.print((ans[i]+1)+" ");
        }
    }
}