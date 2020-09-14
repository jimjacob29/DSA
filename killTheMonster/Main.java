




package killTheMonster;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[]= br.readLine().trim().split(" ");
        int number = Integer.parseInt(s1[0]);
        int maxWeight = Integer.parseInt(s1[1]);
        int monHealth = Integer.parseInt(s1[2]);
        Scanner sc = new Scanner(System.in);
        int [] attackPower = new int[number];
        int [] weaponWeight = new int[number];
        List<Integer>optimalWeapons = new ArrayList<>();
        String s2[] = br.readLine().trim().split(" ");
        for(int i=0;i<number;i++)
        {
            attackPower[i] = Integer.parseInt(s2[i]);
        }
        String s3[] = br.readLine().trim().split(" ");
        for(int i=0;i<number;i++)
        {
            weaponWeight[i] = Integer.parseInt(s3[i]);
        }
        for(int i=0;i<number;i++)
        {
            if(weaponWeight[i]<=maxWeight)
            {
                optimalWeapons.add(attackPower[i]);
            }
        }
        Collections.sort(optimalWeapons);
        int newSize = optimalWeapons.size();
        int damageAchieved =0;
        int weaponCount=0;
        int flag=-1;
        for(int i = newSize-1;i>=0;i--)
        {
            int temp = optimalWeapons.get(i);
            damageAchieved+= temp;
            weaponCount++;
            if(damageAchieved>=monHealth)
            {
                flag=weaponCount;
                break;
            }

        }
        System.out.print(flag);
    }
}























//package killTheMonster;
//import java.util.*;
//public class Main {
//    public static void main(String[]args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int maxWeight = sc.nextInt();
//        int monHealth = sc.nextInt();
//        int [] attackPower = new int[number];
//        int [] weaponWeight = new int[number];
//        List<Integer>optimalWeapons = new ArrayList<>();
//        for(int i=0;i<number;i++)
//        {
//            attackPower[i] = sc.nextInt();
//        }
//        for(int i=0;i<number;i++)
//        {
//            weaponWeight[i] = sc.nextInt();
//        }
//        for(int i=0;i<number;i++)
//        {
//            if(weaponWeight[i]<=maxWeight)
//            {
//                optimalWeapons.add(attackPower[i]);
//            }
//        }
//        Collections.sort(optimalWeapons);
//        int newSize = optimalWeapons.size();
//        int damageAchieved =0;
//        int weaponCount=0;
//        int flag=-1;
//        for(int i = newSize-1;i>=0;i--)
//        {
//            int temp = optimalWeapons.get(i);
//            damageAchieved+= temp;
//            weaponCount++;
//            if(damageAchieved>=monHealth)
//            {
//                flag=weaponCount;
//                break;
//            }
//
//        }
//        System.out.print(flag);
//    }
//}
