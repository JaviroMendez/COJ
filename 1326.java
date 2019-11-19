import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Account {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n=Integer.parseInt(br.readLine());
        int inicial=0;
        for (int i = 0; i <n; i++) {
            inicial=Integer.parseInt(br.readLine());
            int t=Integer.parseInt(br.readLine());
            for (int j = 0; j < t; j++) {
                st=new StringTokenizer(br.readLine());
                String op=st.nextToken();
                if(op.equals("C")){
                    inicial+=Integer.parseInt(st.nextToken());
                }
                else{
                    inicial-=Integer.parseInt(st.nextToken());
                }
            }
            System.out.println(inicial);
        }
    }
}
