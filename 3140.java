import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;


public class ordenar {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out,false);
        int n=Integer.parseInt(br.readLine());
        int []vec=new int[n];
        for (int i = 0; i < n; i++) {
            vec[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(vec);
        for (int i = 0; i < n; i++) {
            pw.println(vec[i]);
        }
        pw.close();
    }
}
