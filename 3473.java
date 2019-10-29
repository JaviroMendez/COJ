import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {

        int[] a = new int[4];

        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        a[3] = sc.nextInt();

        Arrays.sort(a);
        int k = 0;
        if (a[0] == a[1] && a[2] == a[3]) {
            if (a[1] != a[2]) {
                System.out.println("isosceles");
                k = 1;
            }
        }
        int c = 0;
        for (int i = 0; i < 4; i++) {
            if (a[i] == 90) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println("right");
            k = 1;
        }

        if (k == 0) {
            System.out.println("none of the previous");
        }
        out.close();
    }
}
