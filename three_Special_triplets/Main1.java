//package three_Special_triplets;
//import java.util.*;
//import java.io.*;
//public class Main
//{
//    public static void main(String[] args)throws IOException
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int testCases = Integer.parseInt(br.readLine());
//        while(testCases-->0)
//        {
//            int size = Integer.parseInt(br.readLine());
//            long arr[] = new long [size];
//            Map<Long,Integer>hm = new HashMap<>();
//            long res=-1;
//            String s1[] = br.readLine().trim().split(" ");
//            for(int i=0;i<size;i++)
//            {
//                arr[i] = Long.parseLong(s1[i]);
//                hm.put(arr[i],i);
//            }
//            Arrays.sort(arr);
//            for(int i=size-2;i>0;i--)
//            {
//                long max1=0,max2=0,flag=0;
//                for(int j=size-1;j>i;j--)
//                {
//                    if(hm.get(arr[j])>hm.get(arr[i]))
//                    {
//                        max1 = arr[j];
//                        flag=1;
//                        break;
//                    }
//                }
//                int j = i-1;
//                while(j>=0 && flag==1)
//                {
//                    if( hm.get(arr[i])>hm.get(arr[j]))
//                    {
//                        max2 = arr[j];
//                        break;
//                    }
//                    j--;
//                }
//                if(max1!=0 && max2!=0)
//                {
//                    res = (max2 + (arr[i] * max1));
//                    break;
//                }
//            }
//            System.out.println(res);
//        }
//    }
//}




/*import java.util.*;
public class Main1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0)
        {
            int size = sc.nextInt();
            int arr[] = new int [size];
            int res=-1;
            for(int i=0;i<size;i++)
            {
                arr[i] = sc.nextInt();
            }
            for(int i=1;i<size-1;i++)
            {
                int max1=0,max2=0;
                for(int j=0;j<i;j++)
                {
                    if(arr[j]<arr[i])
                    {
                        max1 = Math.max(max1,arr[j]);
                    }
                }
                for(int j=i+1;j<size;j++)
                {
                    if(arr[j]>arr[i])
                    {
                        max2 = Math.max(max2,arr[j]);
                    }
                }
                if(max1!=0 && max2!=0)
                {
                    res = Math.max(res, (max1 + (arr[i] * max2)));
                }
            }
            System.out.print(res);
        }
    }
}*/
