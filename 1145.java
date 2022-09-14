import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
    Scanner sc = new Scanner(System.in);    
    int x = sc.nextInt();
    int y = sc.nextInt();
    int cont = 1;

    for (int i = 1; i <= y;i++) {
        System.out.print(i);
        if (i % x == 0) {
            System.out.println("");

        } else {
            System.out.print(" ");
        }
    }
 
    }
 
}
