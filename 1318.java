import java.io.*;
import java.util.*;
public class Abc {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
        PrintWriter pw=new PrintWriter(System.out,false);
        StringTokenizer st=new StringTokenizer(br.readLine());
        int A,B,C;
        int V[]=new int[3];
        for (int i = 0; i < 3; i++) {
            V[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(V);
        A=V[0];
        B=V[1];
        C=V[2];
        String cadena=br.readLine();
        switch (cadena) {
            case "ABC":
                pw.println(A+" "+B+" "+C);
                break;
            case "ACB":
                pw.println(A+" "+C+" "+B);
                break;
            case "BAC":
                pw.println(B+" "+A+" "+C);
                break;
            case "BCA":
                pw.println(B+" "+C+" "+A);
                break;
            case "CAB":
                pw.println(C+" "+A+" "+B);
                break;
            case "CBA":
                pw.println(C+" "+B+" "+A);
                break;
        }
        pw.close();
    }
}
