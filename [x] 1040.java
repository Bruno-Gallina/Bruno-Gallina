import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		double N1 = sc.nextDouble();	
		double N2 = sc.nextDouble();
		double N3 = sc.nextDouble();
		double N4 = sc.nextDouble();

		double media = (n1 * 2) + (n2 * 3) + (n3 * 4) + (n4) / 10;

		System.out.println("Media: " ,media);

		if (media >= 7) {
			System.out.println("Aluno aprovado.");
		} else if (media < 7 && media >= 5) {
			System.out.println("Aluno em exame.");
			double NExame = sc.nextDouble();
			System.out.println("Nota do exame: ", NExame);
			media = (media + NExame) / 2;

			if (media >= 5) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
				System.out.println("Media final: ",media);

		} else {
			System.out.println("Aluno reprovado.");
		}

	}
}
