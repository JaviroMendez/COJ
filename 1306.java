import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Div4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
        PrintWriter pw=new PrintWriter(System.out,false);
        int T=Integer.parseInt(br.readLine());
        for (int i = 0; i <T; i++) {
            String cadena=br.readLine();
            if(cadena.length()>4){
                int num=Integer.parseInt(cadena.substring(cadena.length()-4,cadena.length()));
                if(num%4==0){
                    pw.println("YES");
                }
                else{
                    pw.println("NO");
                }
            }
            else{
                int num=Integer.parseInt(cadena);
                if(num%4==0){
                    pw.println("YES");
                }
                else{
                    pw.println("NO");
                }
            }
        }
        pw.close();
    }
}
