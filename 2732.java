import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CocoBits {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String cad=br.readLine();
            String nueva="";
            for (int j = 0; j < cad.length(); j++) {
                char letra=cad.charAt(j);
                if(Character.isUpperCase(letra)){
                    letra = (char) (letra + 'a' - 'A');
                    nueva+=letra;
                }
                else{
                    letra = (char) (letra - 'a' + 'A');
                    nueva+=letra;
                }
            }
            System.out.println(nueva);
        }
    }
}
