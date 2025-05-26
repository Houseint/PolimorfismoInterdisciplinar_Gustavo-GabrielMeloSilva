package Mat;

import java.util.Scanner;
public class BonusSalario extends Porcentagem {
    private static final Scanner Scanner = new Scanner(System.in);
    public BonusSalario(){}
    @Override
    public double calcularPorcentagem() {
        System.out.println("Digite o valor do salário em reais: ");
        double a = Scanner.nextDouble();
        setValor(a);
        System.out.println("Digite o valor do bônus em porcentagem: ");
        double b = Scanner.nextDouble();
        setSegValor(b);
        double resultado = (getValor() * getSegValor()) / 100;
        setResultado(resultado);
        System.out.println("O valor do salário é: R$"+a);
        System.out.println("O valor do bônus é: "+b+"%");
        System.out.println("O valor do bônus salarial é: R$"+resultado);
        System.out.println("O salário total com o bônus é: R$"+resultado+a);
        return resultado;
    }
    @Override
    public void def() {
        System.out.println("======================================");
        System.out.println("      CÁLCULO DO BÔNUS SALARIAL      ");
        System.out.println("======================================");
        System.out.println("Fórmula: Bônus = (Salário * Porcentagem) / 100");
        System.out.println("--------------------------------------");
        System.out.println("Onde:");
        System.out.println(" - Salário = Valor do salário base");
        System.out.println(" - Porcentagem = Percentual do bônus a ser aplicado");
        System.out.println("--------------------------------------");
        System.out.println("Exemplo:");
        System.out.println("Se o salário é R$ 2000,00 e o bônus é de 10%, o cálculo será:");
        System.out.println("Bônus = (2000 * 10) / 100 = R$ 200,00");
        System.out.println("======================================");
    }

}
