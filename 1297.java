import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Divisibilityby495{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw=new PrintWriter(System.out,false);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            BigInteger num,r;
            BigInteger modu = new BigInteger("495");
            num = in.nextBigInteger();
            r = num.mod(modu);
            if (r.equals(BigInteger.ZERO)) {
                pw.println("YES");
            }
            else{
                pw.println("NO");
            }
        }
        pw.close();
    }
}
