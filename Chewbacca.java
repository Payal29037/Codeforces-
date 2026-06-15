import java.util.Scanner;
public class Chewbacca{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char [] s = sc.next().toCharArray();
        for(int i=0; i<s.length; i++){
            int t = s[i] - '0';
            if (t > 4 && !(i == 0 && t == 9)){
                s[i] = (char)('0' + (9-t));
            }
           }
            System.out.println(new String(s));
        }
    }
