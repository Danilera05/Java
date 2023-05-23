import java.util.*;
public class danilo20{
   public static void main(String[] args){
      Scanner teclado = new Scanner (System.in);
      double somaImpar=0, somaPar=0, mediaPar, mediaImpar, countPar=0, countImpar=0, maiorPar=0, menorPar=999, maiorImpar=1, menorImpar=999;
      double num = teclado.nextDouble();
      while(num > 0){     
         if(num % 2 == 0){
            somaImpar = somaImpar + num;
            countPar = countPar + 1;           
            if(num > maiorPar){
               maiorPar = num;
            }
            else{
               menorPar = num;
            }
         }
         else{
           somaImpar = somaImpar + num;
           countImpar = countImpar + 1;
           if(num > maiorImpar){
               maiorImpar = num;
           }
           else{
               menorImpar= num;
           }
         } 
         num = teclado.nextDouble();              
      }
      mediaPar = somaPar/countPar;
      mediaImpar = somaImpar/countImpar;
      System.out.printf("A media dos pares é %.2f, o maior par é %.2f e menor par é %.2f\n" , mediaPar, maiorPar, menorPar);
      System.out.printf("A media dos impar é %.2f, o maior impar é %.2f e o menor impar é %.2f",mediaImpar, maiorImpar, menorImpar);
   }
}