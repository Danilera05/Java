import java.util.*;
public class danilo5{
   public static void main(String []args){
      Scanner teclado = new Scanner(System.in);
      int soma=0;
      for(int i=1; i<=10; i++){
         soma = soma+i;  
      }
      System.out.printf("A soma � %d e a media � %d", soma, soma/10);
   }
}