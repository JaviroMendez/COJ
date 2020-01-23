import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalancedWordsI {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int casos=Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            int may=0,min=0;
            String cadena=br.readLine();
            for (int j = 0; j < cadena.length(); j++) {
                if (Character.isUpperCase(cadena.charAt(j))) {
                    may++;
                }
                else{
                    min++;
                }
            }
            if(may==min){
                System.out.println("SI");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
