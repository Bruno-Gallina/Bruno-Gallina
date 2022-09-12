import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        
        int contador = 0;
        
        for (int i = 0; i <= 6; i++) {
            double n = input.nextDouble();
            if (n>0) contador++;
        }
        System.out.println(contador + " valores positivos");
    }
 
}
