import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class Distancia {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));     
        PrintWriter pw=new PrintWriter(System.out,false);
        int casos=Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());
            int d=Integer.parseInt(st.nextToken());
            if(a>c){
                if(b>d){
                    pw.println((a-c)+(b-d));
                }
                else{
                    pw.println((a-c)+(d-b));
                }
            }
            else{
                if(b>d){
                    pw.println((c-a)+(b-d));
                }
                else{
                    pw.println((c-a)+(d-b));
                }
            }
        }
        pw.close();
    }
}
