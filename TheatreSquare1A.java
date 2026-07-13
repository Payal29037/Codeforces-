import java.util.Scanner;
public class TheatreSquare1A{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long totallength =  (n+a-1)/a;
        long totalwidth = (m+a-1)/a;

        long totaltilesrequired = totallength* totalwidth;

        System.out.println(totaltilesrequired);
    }
}