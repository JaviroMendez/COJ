import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class PalabraEnOrdenAscendente {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String cadena=br.readLine();
        char[] letra=new char[cadena.length()];
        letra=cadena.toCharArray();
        Arrays.sort(letra);
        for (int i = 0; i <cadena.length(); i++) {
            System.out.print(letra[i]);
        }
        System.out.println();
    }
}
