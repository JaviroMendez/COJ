import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Ternary {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
        PrintWriter pw=new PrintWriter(System.out,false);
        int N;
        while((N=Integer.parseInt(br.readLine()))>=0){
            pw.println(Integer.toString(N,3));
        }
        pw.close();
    }
}
