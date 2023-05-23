import java.util.*;
public class danilo13{
   public static void main(String []args){
      Scanner teclado = new Scanner(System.in);
      int count = 0;
      int num = teclado.nextInt();
      for(int i=2; i<num;i++){
         if(num%i==0){
            count = count + 1;
         } 
      }
      if(count>0){
         System.out.printf("Ele não é primo");
      }
      else{
         System.out.printf("Ele é primo");
      }
   }
}