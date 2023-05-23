import java.util.*;
public class danilo10{
   public static void main(String []args){
      Scanner teclado = new Scanner(System.in);
      int N = teclado.nextInt();
      double maior=-99999999, menor=99999999;
      for(int i=1; i<=N; i++){
         double digitado = teclado.nextDouble();
         if (i==1){
            maior = digitado;
            menor = digitado;
         }
         else{
            if(digitado>maior){
               maior = digitado;
            }
            else if(digitado<menor){
               menor = digitado;
            }
         }
      }
      System.out.printf("O maior %f e o menor é %f", maior, menor);
      
   }
}