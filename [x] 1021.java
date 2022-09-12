import java.io.IOException;
import java.util.Scanner;
 

// 1st try

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        
        double A = input.nextDouble();
        
        int valor = 0;
        
        System.out.println("NOTAS:");
        
        valor = (int) A / 100;
        System.out.printf("%dnota(s) de R$ 100%n", A);
        A = A % 100.0;
        
        valor = (int) A / 50;
        System.out.printf("%dnota(s) de R$ 50%n", A);
        A = A % 50.0;
        
        valor = (int) A / 20;
        System.out.printf("%dnota(s) de R$ 20%n", A);
        A = A % 20.0;
        
        valor = (int) A / 10;
        System.out.printf("%dnota(s) de R$ 10%n", A);
        A = A % 10.0;
        
        valor = (int) A / 5;
        System.out.printf("%dnota(s) de R$ 5%n", A);
        A = A % 5.0;
        
        valor = (int) A / 2;
        System.out.printf("%dnota(s) de R$ 2%n", A);
        A = A % 2.0;
        
        A = A * 100.0;
        
        System.out.println("MOEDAS:");
        
        valor = (int) A / 100;
        System.out.printf("%dmoeda(s) de R$1.00%n", A);
        A = A % 100.0;
        
        valor = (int) A / 50;
        System.out.printf("%dmoeda(s) de R$0.50%n", A);
        A = A % 50.0;
        
        valor = (int) A / 25;
        System.out.printf("%dmoeda(s) de R$0.25%n", A);
        A = A % 25.0;
        
        valor = (int) A / 10;
        System.out.printf("%dmoeda(s) de R$0.10%n", A);
        A = A % 10.0;
        
        valor = (int) A / 5;
        System.out.printf("%dmoeda(s) de R$0.05%n", A);
        A = A % 5.0;
        
        valor = (int) A / 1;
        System.out.printf("%dmoeda(s) de R$0.01%n", A);
        A = A % 1.0;
        
        input.close();
 
    }
 
}

///////////////////// 2nd try

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

        double dinheiroTotal = input.nextDouble();

        int notas = (int) dinheiroTotal;
        int moedas = (int) ((dinheiroTotal - notas) * 100);

        int notas100 = notas / 100;
        notas -= notas100 * 100;

        int notas50 = notas / 50;
        notas -= notas50 * 50;

        int notas20 = notas / 20;
        notas -= notas20 * 20;

        int notas10 = notas / 10;
        notas -= notas20 * 10;

        int notas5 = notas / 5;
        notas -= notas20 * 5;

        int notas2 = notas / 2;
        notas -= notas2 * 2;

        int moedas1 = notas;
        notas -= moedas1 * 1;

        int moedas50 = moedas / 50;
        moedas -= moedas50 * 50;

        int moedas25 = moedas / 25;
        moedas -= moedas25 * 25;

        int moedas10 = moedas / 10;
        moedas -= moedas10 * 10;

        int moedas05 = moedas / 5;
        moedas -= moedas05 * 5;

        int moedas01 = moedas;


        System.out.println("NOTAS :");

        System.out.println(notas100 + "nota(s) de R$100.00");
        System.out.println(notas50 + "nota(s) de R$50.00");
        System.out.println(notas20 + "nota(s) de R$20.00");
        System.out.println(notas10 + "nota(s) de R$10.00");
        System.out.println(notas5 + "nota(s) de R$5.00");
        System.out.println(notas2 + "nota(s) de R$2.00");

        System.out.println("MOEDAS :");
        System.out.println("moeda(s) de R$1.00");
        System.out.println("moeda(s) de R$0.50");
        System.out.println("moeda(s) de R$0.25");
        System.out.println("moeda(s) de R$0.10");
        System.out.println("moeda(s) de R$0.05");
        System.out.println("moeda(s) de R$0.01");


 
    }
 
}


 //converte p inteiro
//big decimal
//double p int
// v = (int) (v * 100)
