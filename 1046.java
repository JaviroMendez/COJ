import java.io.PrintWriter;
import java.util.Scanner;

public class ProductSubsequence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        PrintWriter pw=new PrintWriter(System.out,false);
        int T,a,b,mod=100;
        int []v=new int[1005];
        for (int i = 1; i <= 1000; i++) {
            v[i] = (i) * (i + 1) * (i + 2);
            v[i] = (v[i] % mod + v[i - 1] % mod) % mod;
        }
        T=sc.nextInt();
        for (int i = 0; i <T; i++) {
            a=sc.nextInt();
            b=sc.nextInt();
            pw.println((v[b]-v[a-1]+mod)%mod);
        }
        pw.close();
    }
}
