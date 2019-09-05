import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DivisibleEntre5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String n=br.readLine();
            if(n.charAt(n.length()-1)=='0' || n.charAt(n.length()-1)=='5'){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
