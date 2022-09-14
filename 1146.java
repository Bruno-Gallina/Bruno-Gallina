import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		int x;
		Scanner sc =new Scanner(System.in);
      
		while (x != 0) {
			for (int i = 1; i <= x; i++) {
			  if (i == x) {
          
				  System.out.print(i+"\n");
          
				} else {
          
					System.out.print(i+" ");
				}
				
			}
		}
	}

}
 
