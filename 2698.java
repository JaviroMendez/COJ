import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String s = in.nextLine();
        char [] charArray = s.toCharArray();
        int total = 0;
        for (char c : charArray) 
            total += ((int) c) - 64;

        System.out.println( total );
    }
}
