import java.util.*;
public class danilo8{
   public static void main(String []args){
      Scanner teclado = new Scanner(System.in);
      double soma = 1;
      double n = teclado.nextInt();
      if(n<0){
         System.out.printf("Não é possivel fazer a conta");
      }
      else{
         for(double i=1; i<=n; i++){
            if(i%2==0){
               soma = soma - 1/i;
            }
            else{
               soma = soma + 1/i;
            }
         }
         System.out.printf("A soma é %f",soma);
      }
   }
}