import java.util.Scanner;
public class FoxAndTheSnake510A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println("#".repeat(m));
            } else {
                boolean right = (i % 4 == 1);
                System.out.println(right ? ".".repeat(m - 1) + "#" : "#" + ".".repeat(m - 1));
            }
        }
    }
}