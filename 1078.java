import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.printf(i + " x " + n +" = " + (i*n)+"\n");
        }
 
    }
 
}

/* alternativa (100%, presentation error)
System.out.printf(i+" x "+ n +" = "+(i*n)+"\n");
*/

