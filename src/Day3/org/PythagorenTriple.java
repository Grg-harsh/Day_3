package Day3.org;
import java.util.Scanner;
public class PythagorenTriple {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int max = a;
        if(b >= max){
            max = b;
        }else if(c >= max){
            max = c;
        }
        if(a==max){
            boolean flag = ((a*a) == (b*b+c*c));
            System.out.println(flag);
        }else if(b == max){
            boolean flag = ((b*b) == (a*a+c*c));
            System.out.println(flag);
        }else if(c == max){
            boolean flag = ((c*c) == (b*b+a*a));
            System.out.println(flag);
        }
    }
}
