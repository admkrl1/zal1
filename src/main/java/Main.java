// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[]  numbers = new int[5];
    int suma = 0;

    for(int i = 0; i<5; i++) {
      System.out.println("Enter a number" + (i+1) + ":");
      numbers[i] = scanner.nextInt();
      suma += numbers[i];
    }

    double średnia = suma / 5.0;

  System.out.println("Suma = " + suma);
  System.out.println("Średnia = " + średnia);
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}