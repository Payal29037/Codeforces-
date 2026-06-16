import java.util.Scanner;
public class BeautifulMatrix263A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int[][] matrix = new int[6][6];
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if(sc.nextInt() == 1){
                    int moves = Math.abs(3-i)+Math.abs(3-j);
                    System.out.println(moves);

                    sc.close();
                    return;
                }
                
            }
        }
      sc.close();
    }
}