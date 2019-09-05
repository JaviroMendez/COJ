import java.io.*;
import java.util.*;
public class Bijele {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
        PrintWriter pw=new PrintWriter(System.out,false);
        int n=Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int king=1-Integer.parseInt(st.nextToken());
            int queen=1-Integer.parseInt(st.nextToken());
            int rooks=2-Integer.parseInt(st.nextToken());
            int bishops=2-Integer.parseInt(st.nextToken());
            int knights=2-Integer.parseInt(st.nextToken());
            int pawns=8-Integer.parseInt(st.nextToken());
            pw.println(king+" "+queen+" "+rooks+" "+bishops+" "+knights+" "+pawns);
        }
        pw.close();
    }
}
