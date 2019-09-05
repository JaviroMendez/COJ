import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
public class Speed {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
        StringTokenizer st;
        PrintWriter pw=new PrintWriter(System.out,false);
        int T=Integer.parseInt(br.readLine());
        for (int i = 0; i <T; i++) {
            int even=0,odd=0;
            int A=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            for (int j = 0; j<A; j++) {
                if(Integer.parseInt(st.nextToken())%2==0){
                   even++;
                } else {
                    odd++;
                }
            }
            pw.println(even + " even and " + odd + " odd.");
        }
        pw.close();
    }
}
