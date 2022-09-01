import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        
        int horaInicial = input.nextInt();
        int horaFinal = input.nextInt();
        
        if (horaInicial > horaFinal) {
            System.out.println("O JOGO DUROU " + ( 24 - (horaInicial - horaFinal)) + " HORA(S)");
        } else if (horaFinal > horaInicial) {
            System.out.println("O JOGO DUROU " + (horaFinal - horaInicial) + " HORA(S)");        
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        
 
    }
 
}
