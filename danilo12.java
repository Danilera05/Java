import java.util.*;
public class danilo12{
   public static void main(String []args){
      Scanner teclado = new Scanner(System.in);
      int menorAcidente = 99999999, maiorAcidente = -99999999, somaAcidente = 0, somaVeiculos = 0, soma200 = 0, count=0;
      String cidadeAcidenteMaior = "", cidadeAcidenteMenor = "";
      for(int i=0; i<5;i++){
         String nomeDaCidade = teclado.nextLine();
         teclado.nextLine();
         int numDeVeiculos = teclado.nextInt();
         int numDeAcidentes = teclado.nextInt();
         if(numDeVeiculos<200){
            soma200 = soma200 + numDeAcidentes;
            count = count + 1;
         }
         if(i==1){
            menorAcidente = numDeAcidentes;
            maiorAcidente = numDeAcidentes;
            cidadeAcidenteMaior = nomeDaCidade;
            cidadeAcidenteMenor = nomeDaCidade;
            somaAcidente = somaAcidente + numDeAcidentes;
            somaVeiculos = somaVeiculos + numDeVeiculos;
         }
         else{
            if(maiorAcidente<numDeAcidentes){
               maiorAcidente = numDeAcidentes;
               cidadeAcidenteMaior = nomeDaCidade;
               somaAcidente = somaAcidente + numDeAcidentes;
               somaVeiculos = somaVeiculos + numDeVeiculos;
            }
            else if(menorAcidente>numDeAcidentes){
               cidadeAcidenteMenor = nomeDaCidade;
               menorAcidente = numDeAcidentes;
               somaAcidente = somaAcidente + numDeAcidentes;
               somaVeiculos = somaVeiculos + numDeVeiculos;
            }
         }
      }
      System.out.printf("O maior indice de acidente � na cidade %s com %d\n", cidadeAcidenteMaior, maiorAcidente);
      System.out.printf("O menor indice de acidente � na cidade %s com %d\n", cidadeAcidenteMenor, menorAcidente);
      System.out.printf("A raz�o entre quantidade de acidentes por quantidade de ve�culos � %d\n", somaAcidente/somaVeiculos);
      System.out.printf("A m�dia de ve�culos nas cinco cidades � %d\n", somaVeiculos/5);
      System.out.printf("A m�dia de acidentes de tr�nsito nas cidades com menos de 200 ve�culos � %d\n", soma200/count);
   }
}