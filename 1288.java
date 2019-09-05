import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Div6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for (int i = 0; i <T; i++) {
            String cadena=br.readLine();
            int aux=Integer.parseInt(cadena.charAt(cadena.length()-1)+"");
            if(div2(aux)&& div3(cadena)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
    static boolean div2(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    
    static boolean div3(String n){
        int sum=0;
        for (int i = 0; i <n.length(); i++) {
            sum+=n.charAt(i)-'0';
        }
        if(sum%3==0){
            return true;
        }
        return false;
    }
}
