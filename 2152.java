import java.io.*;

public class sumadigitos {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1024 * 8);
        PrintWriter pw = new PrintWriter(System.out, false);
        int suma, t;
        String n;
        t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            suma = 0;
            n = br.readLine();
            if (n.contains("-")) {
                for (int j = 1; j < n.length(); j++) {
                    //suma+=Integer.parseInt(""+n.charAt(j));
                    suma += (Integer.parseInt(n.substring(j, j + 1)));
                }
                pw.println(suma);
            } 
            else {
                for (int j = 0; j < n.length(); j++) {
                    //suma+=Integer.parseInt(""+n.charAt(j));
                    suma += (Integer.parseInt(n.substring(j, j + 1)));
                }
                pw.println(suma);
            }
        }
        pw.close();
    }
}
