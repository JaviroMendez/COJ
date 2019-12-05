import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AnotherEnclosed {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String cad=br.readLine();
        int cont=0;
        for (int i = 0; i < cad.length(); i++) {
            char letra=cad.charAt(i);
            if(letra=='A' || letra=='D' || letra=='O' || letra=='P' || letra=='Q' || letra=='R'){
                cont++;
            }
            else if(letra=='B'){
                cont+=2;
            }
        }
        System.out.println(cont);
    }
}
