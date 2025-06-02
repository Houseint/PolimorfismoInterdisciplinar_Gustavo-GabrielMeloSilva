package Mat;
import java.util.Scanner;
public class IMC extends Porcentagem {
    private static final Scanner scanner = new Scanner(System.in);
    public double pesoIdeal;
    @Override
    public double calcularPorcentagem(){
        //calculo de imc e diferença percentual
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
        if(pesoIdeal < 0) {
            System.out.println("Você está "+Math.abs(pesoIdeal)+"% abaixo do peso ideal.");
        } else if (pesoIdeal > 0) {
            System.out.println("Você está "+pesoIdeal+"% acima do peso ideal.");
        } else {
            System.out.println("Você está no peso ideal.");
        }
        return resultado;
    }
        public void def() {
        System.out.println("======================================");
        System.out.println("      CÁLCULO DO IMC     ");
        System.out.println("======================================");
        System.out.println("Fórmula: IMC = Peso / (Altura * Altura)");
        System.out.println("--------------------------------------");
        System.out.println("Onde:");
        System.out.println(" - Peso = Peso em kg");
        System.out.println(" - Altura = Altura em metros");
        System.out.println("--------------------------------------");
        System.out.println("Exemplo:");
        System.out.println("Se uma pessoa pesa 70 kg e tem 1,75 m de altura, o cálculo será:");
        System.out.println("IMC = 70 / (1.75 * 1.75) = 22.86");
        System.out.println("======================================");
        System.out.println(" ");
        System.out.println("====== Como é calculado o percentual de diferença do IMC ideal🧐 ======");
        System.out.println("O IMC ideal é considerado 22.");
        System.out.println("A diferença percentual é calculada da seguinte forma:");
        System.out.println("Peso Ideal = ((IMC - 22) / 22) * 100");
        System.out.println("Se o resultado for negativo, significa que a pessoa está abaixo do peso ideal.");
        System.out.println("Se for positivo, significa que está acima do peso ideal.");
        System.out.println("Se for zero, significa que está no peso ideal.");
        System.out.println("======================================");
    }
}
