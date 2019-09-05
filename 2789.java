import java.io.*;
import java.util.*;
public class SumOrder {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
        PrintWriter pw=new PrintWriter(System.out,false);
        String cadena=br.readLine();
        String A[]=new String[(cadena.length()+1)/2];
        StringTokenizer st=new StringTokenizer(cadena);
        for (int i = 0; i <(cadena.length()+1)/2; i++) {
            A[i]=st.nextToken("+");
        }
        Arrays.sort(A);
        for (int i = 1; i <(cadena.length()+1)/2; i++) {
            System.out.print(A[i-1]+"+");
        }
        System.out.println(A[((cadena.length()+1)/2)-1]);
    }
}
