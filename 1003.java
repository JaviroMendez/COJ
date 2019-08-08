import java.io.*;
import java.util.*;

public class Eleccion
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out,false);
        int casos = Integer.parseInt(br.readLine());
        for (int cont = 0; cont < casos; cont++) 
        {
            String l = br.readLine();
            StringTokenizer st = new StringTokenizer(l);
            int []candidato = new int[Integer.parseInt(st.nextToken())];
            int regiones = Integer.parseInt(st.nextToken());
            for (int cont2 = 0; cont2 < regiones; cont2++) 
            {
                String votos = br.readLine();
                st = new StringTokenizer(votos);
                for (int cont3 = 0; cont3 < candidato.length; cont3++) 
                {
                    candidato[cont3] += Integer.parseInt(st.nextToken());
                }
            }
            int index = 0;
            for (int cont4 = 0; cont4 < candidato.length; cont4++) 
            {
                if (candidato[cont4] > candidato[index]) {
                    index = cont4;

                }
            }

            pw.println(index + 1);
        }
        pw.close();
    }
}
