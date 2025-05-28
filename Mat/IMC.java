package Mat;
import java.util.Scanner;
public class IMC extends Porcentagem {
    private static final Scanner scanner = new Scanner(System.in);
    private double pesoIdeal;
    @Override
    public double calcularPorcentagem(){
        System.out.println("Digite seu peso em kg:");
        double a= scanner.nextDouble();
        setValor(a);
        System.out.println("Digite sua altura em metros:");
        double b= scanner.nextDouble();
        setSegValor(b);
        double resultado= a/(b*b);
        setResultado(resultado);
        System.out.println("Seu IMC é: "+resultado);
        if (resultado <18.5) {
            System.out.println("Você está abaixo do peso ideal.");
        }else if (resultado >= 18.5 && resultado < 24.9) {
            System.out.println("Você está com o peso ideal.");
        }else if (resultado >= 25 && resultado < 29.9) {
            System.out.println("Você está com sobrepeso.");
        }else if (resultado >=30 && resultado < 34.9) {
            System.out.println("Você está com obesidade grau 1.");
        }else if (resultado >= 35 && resultado < 39.9) {
            System.out.println("Você está com obesidade grau 2.");
        }else if (resultado >= 40 ) {
            System.out.println("Você está com obesidade grau 3 (obesidade mórbida).");
        }
        System.out.println("\nFazendo agora a comparação com o peso ideal. Tomando como base 22 com o IMC ideal.");
        pesoIdeal = ((resultado-22)/22)*100;
        if (pesoIdeal >=18.5 && pesoIdeal < 24.9){
            System.out.println("Você está dentro do IMC ideal.");
        }else{
            System.out.println("O IMC está "+pesoIdeal+"% acima do ideal.");
        }
        return resultado;
    }
    
}
