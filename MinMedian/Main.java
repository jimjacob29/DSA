package MinMedian;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0)
        {
            int size = sc.nextInt();
            int search = sc.nextInt();
            int arr[] = new int[size];
            int high=0,equal=0,small=0;
            for(int i=0;i<size;i++)
            {
                arr[i] = sc.nextInt();
                if(arr[i]<search)
                {
                    small++;
                }
                else if(arr[i]>search)
                {
                    high++;
                }
                else
                {
                    equal++;
                }
            }
            int answer;
            if(equal!=0)
            {
                answer = numberExist(small,high,equal);
            }
            else
            {
               answer = numberNotExist(arr,search,size,small,high);
            }
            System.out.println(answer);
        }
    }

    public static int find_left(int arr[],int search,int size)
    {
        int left = 0;
        for(int i=1;i<size;i++)
        {
            if(arr[i]<search && left<arr[i])
            {
                left = arr[i];
            }
        }
        return (left);
    }
    public static int find_right(int arr[],int search,int size)
    {
        int right = 1000001;
        for(int i=1;i<size;i++)
        {
            if(arr[i]>search && right>arr[i])
            {
                right = arr[i];
            }
        }
        return (right);
    }
    public static int numberExist(int small,int high,int equal)
    {
        if(Math.max(small,high)-Math.min(small,high)>=equal)
        {
            return Math.max(small,high)-Math.min(small,high)-(equal-1);
        }
        else
        {
            return 0;
        }
    }
    public static int numberNotExist(int arr[],int search,int size,int small,int high)
    {
        int left= find_left(arr,search,size);
        int right= find_right(arr,search,size);
        if(small>high && high!=0)
        {
            if((2*search)-left<=right)
            {
                return (small-high);
            }
            else
            {
                return (1+(small-high));
            }
        }
        else if(small<high && small!=0)
        {
            if((2*search)-right>=left)
            {
                return (high - small);
            }
            else
            {
                return (1+(high-small));
            }
        }
        else if (small==high)
        {
            if(left+right == 2*search)
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }
       else
        {
            return (Math.max(high,small));
        }

    }
}
