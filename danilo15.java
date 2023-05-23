import java.util.*;
public class danilo15{
   public static void main(String []args){
      Scanner teclado = new Scanner(System.in);
      int N = teclado.nextInt();
      int num=1, anterior=0, aux;
      for(int i=1; i<=N; i++){ 
         System.out.println(num + " ");
         aux = num;
         num = num + anterior;
         anterior = aux;
      } 
   }
}