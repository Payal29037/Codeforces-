import java.util.Scanner;
public class GamesontheTrain2236A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int j=0; j<n; j++){
                int k = sc.nextInt();
                min = Math.min(min, k);
                max = Math.max(max, k);
            }
            System.out.println(max - min + 1);
            

        }
    }
}