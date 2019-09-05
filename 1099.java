import java.io.*;
import java.util.*;
public class numerospitagoricos {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
        PrintWriter pw=new PrintWriter(System.out,false);
        int n;
        StringTokenizer tk = new StringTokenizer(br.readLine());
        n=Integer.parseInt(tk.nextToken());
        while(n!=0){
            int A[]=new int[3];
            A[0]=n;
            A[1]=Integer.parseInt(tk.nextToken());
            A[2]=Integer.parseInt(tk.nextToken());
            Arrays.sort(A);
            if(Math.pow(A[0],2)+Math.pow(A[1],2)==Math.pow(A[2],2)){
                pw.println("right");
            }
            else{
                pw.println("wrong");
            }
            tk = new StringTokenizer(br.readLine());
            n=Integer.parseInt(tk.nextToken());
        }
        pw.close();
    }
}
