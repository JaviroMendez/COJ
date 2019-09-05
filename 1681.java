import java.util.Scanner;

public class ResolviendoPolinomios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (((b * b) - 4 * a * c) < 0) {
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
