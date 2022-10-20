import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        double a, b, c, areaTrapezio, perimetro;
        
        Scanner input = new Scanner(System.in);
        
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        
        if (a < (b+c) && b < (a+c) && (c < (a+b))) {
            perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n",perimetro);
        
            
            
        } else {
            
            areaTrapezio = ((a+b) * c) / 2;
            System.out.printf("Area = %.1f\n",areaTrapezio);
        }
 
    }
 
}
