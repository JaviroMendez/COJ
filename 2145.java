import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beauty {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int suma;
        for (int i = 0; i < n; i++) {
            int[]vec=new int[10];
            StringTokenizer st=new StringTokenizer(br.readLine());
            suma=0;
            for (int j = 0; j < 10; j++) {
                vec[j]=Integer.parseInt(st.nextToken());
                suma+=vec[j];
            }
            Arrays.sort(vec);
            suma-=vec[0]+vec[9];
            System.out.println(i+1+" "+suma);
        }
    }
}
