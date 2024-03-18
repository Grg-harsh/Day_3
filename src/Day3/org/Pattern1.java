package Day3.org;
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i <= n; i++){
            int num = i;
            for(int j = 1; j <= num; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
