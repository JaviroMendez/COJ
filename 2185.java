import java.io.*;
import java.util.*;
public class ab {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
        PrintWriter pw=new PrintWriter(System.out,false);
        int a,b;
        StringTokenizer st=new StringTokenizer(br.readLine());
        a=Integer.parseInt(st.nextToken());
        b=Integer.parseInt(st.nextToken());
        pw.println(a+b);
        pw.println(a-b);
        pw.println(a*b);
        pw.println(a/b);
        pw.println(a%b);
        pw.close();
    }
}
