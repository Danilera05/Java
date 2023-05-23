import java.util.*;
public class danilo19{
   public static void main(String[] args){
      Scanner in = new Scanner (System.in);
      double soma=0, media, count=0, num;
      do{
         num = in.nextDouble();
         if(num>0){
            soma = soma + num;
            count = count+ 1;
         }      
   }while( num != -1); 
   media = soma / count;
   System.out.printf("O resultado: %.2f", media); 
   }
}