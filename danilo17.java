import java.util.*;
public class danilo17{
   public static void main(String[] args){   
    Scanner teclado = new Scanner (System.in);
    int resto;
    int A = teclado.nextInt();
    int B = teclado.nextInt();
    while ( B != 0) {      
      resto = A % B;
      A = B;
      B = resto;
    }
    System.out.printf("O mdc dos numeros e: %d",A);
   }
}