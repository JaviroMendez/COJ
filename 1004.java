import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RejillaDeDesplazamiento {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            if(a==b){
                if(a%2==0){
                    System.out.println("L");
                }
                else{
                    System.out.println("R");
                }
            }
            else if(a>b){
                if(b%2==0){
                    System.out.println("U");
                }
                else{
                    System.out.println("D");
                }
            }
            else{
                if(a%2==0){
                    System.out.println("L");
                }
                else{
                    System.out.println("R");
                }
            }
        }
    }
}
