import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class SodaSurpler {
    public static void main(String[] args) throws IOException {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
            PrintWriter pw=new PrintWriter(System.out,false);
            int N,E,F,C,T,R;
            StringTokenizer st;
            N=Integer.parseInt(br.readLine());
            for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            E = Integer.parseInt(st.nextToken());
            F = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            T = E + F;
            R = 0;
            if (C == 1) {
                System.out.println("0");
            } else {
                while (T >= C) {
                    T = T - C + 1;
                    R++;
                }
                System.out.println(R);
            }
        }
    }
}
