import java.util.Scanner;

public class Despertador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            if (a == 0 && b == 0 && c == 0 && d == 0) {
                break;
            }
            int ini=(a*60)+b;
            int fin=(c*60)+d;
            if(ini<fin){
                System.out.println(fin-ini);
            }
            else{
                fin+=1440;
                System.out.println(fin-ini);
            }
        }
    }
}
