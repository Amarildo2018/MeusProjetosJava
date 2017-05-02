import java.util.Scanner;
import javax.swing.JOptionPane;
public class sistema{
  
  public static void main(String[] args){

  Scanner ler = new Scanner(System.in);
    
  System.out.println("Digite o nome do Aluno:");
  String nome = ler.nextLine();

  System.out.println("Digite a 1° nota:");
  int n1 = ler.nextInt();

  System.out.println("Digite a 2° nora:");
  int n2 = ler.nextInt();

  float m = (n1+n1)/2;
  
  if(m >= 7){
    System.out.printf("%s Aluno Aprovado Direto", nome);
    System.out.println("\nNota: " +m);
  }else{
    System.out.println("Digite a nota da reavalição:");
    int r = ler.nextInt();
    
   float nf = (m+r)/2;
   if(nf >= 7){
   JOptionPane.showMessageDialog(null, "Aluno: " + nome + "aprovado com nota de reavaliação");
   JOptionPane.showMessageDialog(null, "\nNota: " + nf);
    }else{
   System.out.printf("%s Reprovado com nota de reavaliação: ", nome);
   System.out.println("\nNota: " + nf);
     }
   }
 }
}
