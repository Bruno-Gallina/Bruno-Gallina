/* Forma alterativa, retorna primeiro o input na multiplicação, porem com o mesmo resultado */


import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.printf("%d x %d = %d \n", n, i, n * i);
        }
 
    }
 
}
