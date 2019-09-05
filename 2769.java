import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EngineersDay {
	public static void main(String [] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
                PrintWriter pw=new PrintWriter(System.out,false);
		int N;	
		N = Integer.parseInt(br.readLine());
		for(int i = 1; i <= N; i++){
			pw.println(i+": I am participating in the Engineer's day.");
                }
                pw.close();
	}
}
