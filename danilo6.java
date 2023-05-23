import java.util.*;
public class danilo6{
   public static void main(String []args){
      Scanner teclado = new Scanner(System.in);
      int soma = 0;
      int numero = teclado.nextInt();
      for(int i=1; i<=numero; i++){
         soma = soma + i;
      }
      System.out.printf("A soma é %d e a média é %d",soma, soma/numero);
   }
}