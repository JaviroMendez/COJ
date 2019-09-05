import java.io.*;
import java.util.*;
public class Reflexion {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
        PrintWriter pw=new PrintWriter(System.out,false);
        StringTokenizer st=new StringTokenizer(br.readLine());
        String resultado="";
        int grupos=Integer.parseInt(st.nextToken());
        while(grupos!=0){
            String cadena=st.nextToken();
            for (int i = 0; i <cadena.length();i+=(cadena.length()/grupos)) {
            String nuevacadena=cadena.substring(i, i+(cadena.length()/grupos));
            StringBuilder sb=new StringBuilder(nuevacadena);
            String voltear=sb.reverse().toString();
            resultado+=voltear;
            }
            pw.println(resultado);
            st=new StringTokenizer(br.readLine());
            grupos=Integer.parseInt(st.nextToken());
            resultado="";
        }
        pw.close();
    }
}
