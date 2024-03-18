package Day3.org;
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i <= n; i++){
            int nspace = n-i;
            int nstr = i;
            for(int j = 1; j <= nspace; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= nstr; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
