import java.util.*;
public class danilo11{
   public static void main(String []args){
      Scanner teclado = new Scanner(System.in);
      int quantosAlunos = teclado.nextInt();
      double maior=-999999, menor = 999999;
      String maiorAluno = "", menorAluno = "";
      for(int i = 1; i<=quantosAlunos; i++){
         double nota = teclado.nextDouble();
         teclado.nextLine();
         String aluno = teclado.nextLine();
         if(i==1){
            maior = nota;
            menor = nota;
            maiorAluno = aluno;
            menorAluno = aluno;
         }
         else{
            if(nota>maior){
               maior=nota;
               maiorAluno=aluno;
            }
            else if(nota<menor){
               menor = nota;
               menorAluno = aluno;
            }
         }
      }
      System.out.printf("A maior nota é %.2f do %s \n", maior, maiorAluno);
      System.out.printf("A menor nota é %.2f do %s \n", menor, menorAluno);
   }
}