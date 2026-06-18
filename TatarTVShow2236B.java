import java.util.Scanner;
public class TatarTVShow2236B{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            String s = sc.next();

            int[] parity = new int[k];
            for(int i=0; i<n; i++){
                if (s.charAt(i) == '1'){
                    parity[i % k] ^= 1;
                }
              }
            boolean ok = true;
                for (int x : parity) {
                    if (x != 0) ok = false;
                }
             
                 System.out.println(ok ? "YES" : "NO");
            }
            
        }
    }
