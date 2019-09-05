import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Aaaaaaaah {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
        PrintWriter pw=new PrintWriter(System.out,false);
        int N=Integer.parseInt(br.readLine());
        String cadena="A";
        for (int i = 0; i <N*4; i++) {
            cadena+="a";
        }
        cadena+="h";
        pw.println(cadena);
        pw.close();
    }
}
