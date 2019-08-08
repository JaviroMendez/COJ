import java.io.*;
public class Administracion {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
        PrintWriter pw= new PrintWriter(System.out,false);
        float n=0;
        for (int i = 0; i < 12; i++) {
            n+=Float.parseFloat(br.readLine());
        }
        String res=String.format("%.2f",(n/12));
        pw.println("$"+res);
        pw.close();
    }
}
