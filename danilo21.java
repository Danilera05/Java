import java.util.*;
public class danilo21{
   public static void main(String[] args){
      Scanner teclado = new Scanner (System.in);
      int d, palin=0;
      int num = teclado.nextInt(); 
      int aux = num;
      while(num >0){      
         d = num % 10;
         num = num /10;
         palin = (10 * palin) + d;
      }
      if(palin==aux){
         System.out.printf("Seu número é palindromo");
      }
      else{
         System.out.printf("Seu número não é palindromo");
      }
   }  
}