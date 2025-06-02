package Mat;

public class definicaoPor extends Porcentagem {
    public void definicaoPor(){}
    @Override
    public double calcularPorcentagem() {
        return 0;
    }
    @Override
    public void def(){
        System.out.println("======================================");
        System.out.println("      DEFINIÇÃO DE PORCENTAGEM       ");
        System.out.println("======================================");
        System.out.println("A porcentagem é uma forma de expressar uma parte de um todo em termos de 100.");
        System.out.println("Ela é frequentemente usada para calcular descontos, aumentos salariais, juros, entre outros.");
        System.out.println("A fórmula básica para calcular a porcentagem é:");
        System.out.println("Porcentagem = (Parte / Todo) * 100");
        System.out.println("--------------------------------------");
        System.out.println("Exemplo:");
        System.out.println("Se você tem 20 maçãs e comeu 5, a porcentagem de maçãs comidas é:");
        System.out.println("Porcentagem = (5 / 20) * 100 = 25%");
        System.out.println("======================================");
    }
}
