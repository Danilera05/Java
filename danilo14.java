import java.util.*;
public class danilo14{
   public static void main(String []args){
      Scanner teclado = new Scanner(System.in);
      int fatorial = 1;
      int N = teclado.nextInt();
      for (int i=1; i<=N; i++){
         fatorial = fatorial*i;
      }
      System.out.printf("O fatorial é %d", fatorial);
   }
}