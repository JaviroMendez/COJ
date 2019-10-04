import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Math.abs(sc.nextInt());
        int b = Math.abs(sc.nextInt());
        int c = Math.abs(sc.nextInt());
        if(a==0 || b==0 || c==0){
            System.out.println("Error");
        }
        else if (a + b + c != 180) {
            System.out.println("Error");
        } else if (a == b) {
            if (a == c) {
                System.out.println("Equilateral");
            } else {
                System.out.println("Isosceles");
            }
        } else if (b == c) {
            System.out.println("Isosceles");
        }
        else if(a==c){
            System.out.println("Isosceles");
        }
        else{
            System.out.println("Scalene");
        }
    }
}
