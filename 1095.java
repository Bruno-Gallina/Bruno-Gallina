import java.io.IOException;


public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int i = 1;
        int j = 60;
        
        while (j >= 0) {
            
            System.out.printf("I=%d J=%d\n", i, j);
            i = i + 3;
            j = j - 5;
        }
    }
}
