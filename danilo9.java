import java.util.*;
public class danilo9{
   public static void main(String []args){
      Scanner teclado = new Scanner(System.in);
      int N = teclado.nextInt();
      double soma = 0;
      for(int i=1; i<=N; i++){
         double digitado = teclado.nextDouble();
         soma = soma + digitado;
      }
      System.out.printf("A soma é %f e a média é %f", soma, soma/N);
      
   }
}