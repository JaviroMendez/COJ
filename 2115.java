import java.io.IOException;

import java.io.PrintWriter;
import java.util.Scanner;


public class HotDogs {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out, false);
        while (sc.hasNext()) {
            double A = sc.nextInt();
            double B = sc.nextInt();
            double valor = A / B;
            System.out.println(String.format("%.2f", valor));
        }
    }
}
