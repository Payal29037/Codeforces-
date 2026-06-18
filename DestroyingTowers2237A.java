import java.util.Scanner;
public class DestroyingTowers2237A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int minHeight = Integer.MAX_VALUE;
            long ans = 0;
            
            for(int j=0; j<n; j++){
                arr[j] = sc.nextInt();
                minHeight = Math.min(minHeight, arr[j]);
                ans += minHeight;
                
            }
            System.out.println(ans);
        }
        
    }
}