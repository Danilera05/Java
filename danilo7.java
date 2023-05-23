import java.util.*;
public class danilo7{
   public static void main(String []args){
      Scanner teclado = new Scanner(System.in);
      double soma = 0;
      double n = teclado.nextInt();
      if(n<0){
         System.out.printf("Não é possivel fazer a conta");
      }
      else{
         for(double i=1; i<=n; i++){
            soma = soma + 1/i;
         }
         System.out.printf("A soma é %f",soma);
      }
   }
}