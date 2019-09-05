import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class GeometricalTaskI {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1024 * 8);
        PrintWriter pw = new PrintWriter(System.out, false);
        StringTokenizer st;
        String cadena=br.readLine();
        st=new StringTokenizer(cadena);
        if(st.nextToken().equals("square")){
            int A=Integer.parseInt(st.nextToken());
            pw.println(A*A);
        }
        else{
            int A=Integer.parseInt(st.nextToken());
            int B=Integer.parseInt(st.nextToken());
            pw.println(A*B);
        }
        pw.close();
    }
}
