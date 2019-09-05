import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;


public class IncreasingOrderList {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
        PrintWriter pw=new PrintWriter(System.out,false);
        int T=Integer.parseInt(br.readLine());
        int V[]=new int[T];
        for (int i = 0; i < T; i++) {
           V[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(V);
        for (int i = 0; i <T; i++) {
            pw.println(V[i]);
        }
        pw.close();
    }
}
