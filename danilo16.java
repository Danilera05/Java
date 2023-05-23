import java.util.*;
public class danilo16{
   public static void main (String []args){
      Scanner teclado = new Scanner(System.in);
      String hexa = "";
      boolean confirmar = true;
      int decimal = 0, aux, bit,  octal=0,posicao;
      int expoente=0, mult = 1;
      int binario = teclado.nextInt();
      while (binario>0){
         bit = binario%10;
         binario = binario/10;
         if(bit==0 || bit==1){
            decimal = (int)(Math.pow(2,expoente))*bit+decimal;
         }
         else{
            confirmar = false;
         }
         expoente++;
      }
      if(confirmar == false){
         System.out.printf("Não é binario");
      }
      else{
         System.out.printf("O número em decimal é %d \n", decimal);
         aux = decimal;
         while(decimal>0){
            bit = decimal%8;
            decimal = decimal/8;
            octal = bit*mult + octal;
            mult = mult*10;
         }  
         System.out.printf("O número em octal é %d \n", octal);
         while(aux>0){
            posicao=aux%16;
            aux = aux/16;
            if(posicao<10){
                hexa = hexa + posicao;
            }
            else{
               if(posicao==10)
                  hexa = hexa + "A";
               else if(posicao==11)
                  hexa = hexa + "B";
               else if(posicao==12)
                  hexa = hexa + "C";
               else if(posicao==13)
                  hexa = hexa + "D";
               else if(posicao==14)
                  hexa = hexa + "E";
               else if(posicao==15)
                  hexa = hexa + "F";
            }
         }
         System.out.printf("O número em HEXAdecimal é %s \n", hexa);
      }
   }
}