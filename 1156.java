import java.io.*;
public class LaVida {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
        PrintWriter pw=new PrintWriter(System.out,false);
        int a;
        a=Integer.parseInt(br.readLine());
        while(a!=42){
            pw.println(a);
            a=Integer.parseInt(br.readLine());
        }
        pw.close();
    }
}
