import java.util.Scanner;
public class Problema {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt(); 
        if (n >= 0)
                System.out.println(n + (n * (n - 1)) / 2);
            else
                System.out.println(((n * (n - 1)) / -2)+1);
    }
}
