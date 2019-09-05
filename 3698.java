import java.util.Scanner;


public class ContandoLetras {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String cadena=sc.next();
        int cont=0;
        for (int i = 0; i <n; i++) {
            if(Character.isUpperCase(cadena.charAt(i))){
                cont++;
            }
        }
        int minusculas=cadena.length()-cont;
        System.out.println(cont+" "+minusculas);
    }
}
