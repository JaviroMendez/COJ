import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Bishops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw=new PrintWriter(System.out,false);
        BigInteger two = new BigInteger("2");
        BigInteger one = new BigInteger("1");
        BigInteger zero = new BigInteger("0");
        BigInteger big;
        String num;
        while (sc.hasNext()) {
            big = sc.nextBigInteger();
            if (big.compareTo(zero) == 0) {
                pw.println("0");
            } else if (big.compareTo(one) == 0) {
                pw.println("1");
            } else if (big.compareTo(two) == 0) {
                pw.println("2");
            } else {
                big = big.add(big);
                big = big.subtract(two);
                pw.println(big.toString());
            }
        }
        pw.close();
    }
}
