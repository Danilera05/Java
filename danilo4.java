import java.util.*;
public class danilo4{
   public static void main(String []args){
      Scanner teclado = new Scanner(System.in);
      int usuario = 0;
      while(usuario!=-999){
         System.out.printf("Quantos usuarios?");
         usuario = teclado.nextInt();
         System.out.printf("o triplo é %d \n",usuario*3);
      }
   }
}