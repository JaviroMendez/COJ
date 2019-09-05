import java.io.*;
import java.util.*;
public class abcomplejo {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
        PrintWriter pw=new PrintWriter(System.out,false);
        long a,b,R;
        StringTokenizer st=new StringTokenizer(br.readLine());
        a=Integer.parseInt(st.nextToken());
        b=Integer.parseInt(st.nextToken());
        R=(a+b)*2;
        pw.println(R);
        pw.close();
    }
}
