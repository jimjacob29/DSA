package Max_Rectangle;
import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args)throws IOException
    {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().trim().split(" ");
        //int N = sc.nextInt();
        //int M = sc.nextInt();
        int N= Integer.parseInt(s1[0]);
        int M = Integer.parseInt(s1[1]);
        int mat[][] = new int[N][M];
        int sum[][] = new int[N][M];
        for(int i=0;i<N;i++)
        {
            String s2[] = br.readLine().trim().split(" ");
            for(int j=0;j<M;j++)
            {
                mat[i][j] = Integer.parseInt(s2[j]);
            }
        }
        sumMatrix(mat,sum,N,M);
        int max= findMax(sum,N,M);
        System.out.print(max);
    }


    public static void sumMatrix(int mat[][],int sum[][],int N,int M)
    {
        for(int i=0;i<N;i++)
        {
            int sum1=0;
            for(int k=0;k<M;k++)
            {
                if (mat[k][i]==0)
                {
                    sum1=0;
                }
                else
                {
                    sum1=sum1+mat[k][i];
                }
                sum[k][i] = sum1;
            }
        }
    }


    public static int findMax(int sum[][],int N,int M)
    {
        int max=0,actualMax=1;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                int count=1,min=sum[i][j],temp;
                max=sum[i][j];
                if(actualMax<max)
                {
                    actualMax=max;
                }
                if(sum[i][j]==0)
                {
                    continue;
                }
                else
                {
                    min=sum[i][j];
                    for (int k = j + 1; k < M; k++)
                    {
                        if (sum[i][k]!=0 )
                        {
                            count++;
                            min = Math.min(min,sum[i][k]);
                            temp=count * min;
                            if(actualMax<temp)
                            {
                                actualMax=temp;
                            }
                        }
                        else
                        {
                            break;
                        }
                    }
                }
            }
        }
        return actualMax;
    }
}
