import java.util.Scanner;
public class SoftDrinking151A {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int result = 0; 

        for (int i=1; i<=1000; i++){
        int totalLitre = k * l;
        int totaltoasts = (totalLitre/nl);
        int totalLimes = c*d;
        int totalSalt = p/np;
        int min = Math.min(totaltoasts, Math.min(totalLimes, totalSalt));
         result = min/n; 
         
        } 
        System.out.println(result);   
    }
}