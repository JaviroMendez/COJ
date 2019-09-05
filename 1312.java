import java.io.*;
import java.util.*;
public class R2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
        StringTokenizer st=new StringTokenizer(br.readLine());
        PrintWriter pw=new PrintWriter(System.out,false);
        int R1=Integer.parseInt(st.nextToken());
        int S=Integer.parseInt(st.nextToken());
        pw.println(((S*2)-R1));
        pw.close();
    }
}
