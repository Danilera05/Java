import java.util.*;
public class danilo18{
   public static void main(String[] args){  
      Scanner teclado = new Scanner (System.in); 
      double num1, num2, resultado=0;
      System.out.printf("====================\n");
      System.out.printf("Calculadora de Fulano\n");
      System.out.printf("====================\n");
      System.out.printf("Opcoes:\n");
      System.out.printf("\t1 - Soma\n");
      System.out.printf("\t2 - Subtracao\n");
      System.out.printf("\t3 - Multiplicacao\n");
      System.out.printf("\t4 - Divisao\n");
      System.out.printf("\t5 - Sair\n");
      System.out.printf("====================\n");
      int opcao = teclado.nextInt();
      while(opcao !=5){
          num1 = teclado.nextDouble();
          num2 = teclado.nextDouble();      
      if(opcao == 1)
      {        
         resultado = num1 + num2;
         System.out.printf("Resultado: %.2f",resultado); 
      }
      else if(opcao==2)
      {       
         resultado = num1 - num2;
         System.out.printf("Resultado: %.2f",resultado);  
      }
      else if(opcao==3)
      {    
         resultado = num1 * num2; 
         System.out.printf("Resultado: %.2f",resultado);  
      }
      else if(opcao == 4)
      {
         if(num2 == 0 || num1 == 0)
         {
            System.out.print("Divisao por zero.");
         }
         else
         {      
            resultado = num1 / num2;
            System.out.printf("Resultado: %.2f",resultado); 
         }
      }
      else{
         System.out.printf("Não possui essa opção");
      }      
      opcao = teclado.nextInt();         
      }   
   }
}