//importa a classe Scanner paraser utilizado aqui:
import java.util.Scanner;
public class Main {
  public static void main(String []args){
    //declaracao do scanner;
    //a classe scaner tem como objetivo separar a enreada dos textos em blocos,  gerando os conhecidos tokens, que sao sequencias de caracteres;
    //separados por delimitadores que por padrao correspondem aos espacos em branco, tabulacoes e mudanca de linha;
    Scanner leitor = new Scanner(System.in);
   // declaacao das variaveis que serao utiizadas;
    float peso, altura, imc;
    //peso e altura entrada e imc saida;
    System.out.print("informe o PESO: ");
// le e armazena o valor do peso;
    peso = leitor.nextFloat()
      // le e armazena o valor da altura;
      System.out.print("informe a ALTURA: ");
       altura= leitor.nextFloat();
    //calcula;
      imc = peso / (altura * altura);
    //imprime o resultado;
    //note que pode se conectar o resultado com a impressao do texto;
    System.out.print("\n\tO IMC desta pessoa é: "+ imc + "\n\n");
  }
}
