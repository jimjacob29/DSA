package waterWorld;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException{
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int days = Integer.parseInt(br.readLine());
        int clusterNumber = Integer.parseInt(br.readLine());
        int clusterDetails[][] = new int[clusterNumber][4];
        long totalRequirement=0;
        for(int i=0;i<clusterNumber;i++){
            String s1[] = br.readLine().trim().split(" ");
            //System.out.println(s1);
            clusterDetails[i][0]= i+1;
            clusterDetails[i][1]=Integer.parseInt(s1[1]);
            //System.out.print(clusterDetails[i][1]+" ");
            clusterDetails[i][2]=Integer.parseInt(s1[2]);
            //System.out.print(clusterDetails[i][2]+" ");
            clusterDetails[i][3]=clusterDetails[i][2];
            //System.out.print(clusterDetails[i][2]+ " ");
            totalRequirement+=clusterDetails[i][2];

        }
//        for(int i=0;i<clusterNumber;i++) {
//            System.out.print(Arrays.toString(clusterDetails[i]));
//        }
        int connectionNumber = Integer.parseInt(br.readLine());
        //System.out.print("number "+connectionNumber);
        String connectionDetails[]=new String[connectionNumber];
        for(int i=0;i<connectionNumber;i++){
            connectionDetails[i] ="";
            String s1[]= br.readLine().trim().split("_");
            //System.out.println(Arrays.toString( s1));
            for(int j=0;j<s1.length;j++){
                if(s1[j].equals("F")){
                    connectionDetails[i]+="0";
                    connectionDetails[i]+=" ";
                }
                else{
                    String[] s2 = s1[j].split("C");
//                    System.out.print("carr ");
//                    System.out.println(Arrays.toString((s2)));
//                    System.out.println("1st"+s2[1]);
                    connectionDetails[i]+=s2[1];
                    connectionDetails[i]+=" ";
                }
            }
//            System.out.println("CD"+connectionDetails[i]);

        }
        for(int i=0;i<days;i++){
            for(int j=0;j<clusterNumber;j++){
                if(clusterDetails[j][3]>=clusterDetails[j][1]){
                    clusterDetails[j][3]=  clusterDetails[j][3]-clusterDetails[j][1];
                }
                else if(clusterDetails[j][3]<clusterDetails[j][1]&& j+1<clusterNumber && clusterDetails[j+1][3]<clusterDetails[j+1][1]){
                    if(connectionDetails[j].contains((j+1)+"")){
                        String s1[] = connectionDetails[j+1].split(" ");
                        //System.out.println(Arrays.toString(s1));
                        for(int k=0;k<s1.length;k++){
                            int m= Integer.parseInt(s1[k]);
//                        System.out.println("m"+m);
                            if(m!=0){
                                totalRequirement+= clusterDetails[m-1][2];
                                clusterDetails[m-1][3] = clusterDetails[m-1][2];
                            }
                        }

                    }
                    else {
                        String s1[] = connectionDetails[j].split(" ");
                        //System.out.println(Arrays.toString(s1));
                        for(int k=0;k<s1.length;k++){
                            int m= Integer.parseInt(s1[k]);
//                        System.out.println("m"+m);
                            if(m!=0){
                                totalRequirement+= clusterDetails[m-1][2];
                                clusterDetails[m-1][3] = clusterDetails[m-1][2];
                            }
                        }
                    }
                }
                else {
                    String s1[] = connectionDetails[j].split(" ");
                    //System.out.println(Arrays.toString(s1));
                    for(int k=0;k<s1.length;k++){
                        int m= Integer.parseInt(s1[k]);
//                        System.out.println("m"+m);
                        if(m!=0){
                            totalRequirement+= clusterDetails[m-1][2];
                            clusterDetails[m-1][3] = clusterDetails[m-1][2];
                        }
                    }
                }
            }

        }
        System.out.print(totalRequirement);
    }
}
/*void

import java.util.*;
import java.io.*;
class code {
    public static void main(String[] args)throws IOException{
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int days = Integer.parseInt(br.readLine());
        int clusterNumber = Integer.parseInt(br.readLine());
        int clusterDetails[][] = new int[clusterNumber][4];
        long totalRequirement=0;
        for(int i=0;i<clusterNumber;i++){
            String s1[] = br.readLine().trim().split(" ");
            //System.out.println(s1);
            clusterDetails[i][0]= i+1;
            clusterDetails[i][1]=Integer.parseInt(s1[1]);
            //System.out.print(clusterDetails[i][1]+" ");
            clusterDetails[i][2]=Integer.parseInt(s1[2]);
            //System.out.print(clusterDetails[i][2]+" ");
            clusterDetails[i][3]=clusterDetails[i][2];
            //System.out.print(clusterDetails[i][2]+ " ");
            totalRequirement+=clusterDetails[i][2];

        }
//        for(int i=0;i<clusterNumber;i++) {
//            System.out.print(Arrays.toString(clusterDetails[i]));
//        }
        int connectionNumber = Integer.parseInt(br.readLine());
        //System.out.print("number "+connectionNumber);
        String connectionDetails[]=new String[connectionNumber];
        for(int i=0;i<connectionNumber;i++){
            connectionDetails[i] ="";
            String s1[]= br.readLine().trim().split("_");
            //System.out.println(Arrays.toString( s1));
            for(int j=0;j<s1.length;j++){
                if(s1[j].equals("F")){
                    connectionDetails[i]+="0";
                    connectionDetails[i]+=" ";
                }
                else{
                    String[] s2 = s1[j].split("C");
//                    System.out.print("carr ");
//                    System.out.println(Arrays.toString((s2)));
//                    System.out.println("1st"+s2[1]);
                    connectionDetails[i]+=s2[1];
                    connectionDetails[i]+=" ";
                }
            }
//            System.out.println("CD"+connectionDetails[i]);

        }
        for(int i=0;i<days;i++){
            for(int j=0;j<clusterNumber;j++){
                if(clusterDetails[j][3]>=clusterDetails[j][1]){
                    clusterDetails[j][3]=  clusterDetails[j][3]-clusterDetails[j][1];
                }
                else{
                    String s1[] = connectionDetails[j].split(" ");
                    //System.out.println(Arrays.toString(s1));
                    for(int k=0;k<s1.length;k++){
                        int m= Integer.parseInt(s1[k]);
//                        System.out.println("m"+m);
                        if(m!=0){
                            totalRequirement+= clusterDetails[m-1][2];
                            clusterDetails[m-1][3] = clusterDetails[m-1][2];
                        }
                    }
                }
            }

        }
        System.out.print(totalRequirement);
    }
}



 */