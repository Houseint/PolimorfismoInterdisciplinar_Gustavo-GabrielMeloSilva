package Física;

public class calculoMU extends MU {
    public calculoMU(){}
    @Override
    public float formula(){
        System.out.println("Calcule o Movimento Uniforme de um carro: ");
        System.out.println("Digite a posição inicial do carro:");
        float Si = getPInicial();
        System.out.println("Digite a velocidade (m/s): ");
        float v = getVMovel();
        System.out.println("Digite o tempo do bagulho: ");
        float t = getTempo();

        
    }
    @Override
    public void defVM(){
        System.out.println("======================================");
        System.out.println("      CÁLCULO DO MOVIMENTO UNIFORME   ");
        System.out.println("======================================");
        System.out.println("Fórmula: S = Si + v * t");
        System.out.println("--------------------------------------");
        System.out.println("Onde:");
        System.out.println(" - S = Posição final");
        System.out.println(" - Si  = Posição inicial");
        System.out.println(" - v  = Velocidade móvel");
        System.out.println(" - T  = Tempo gasto");
        System.out.println("--------------------------------------");
        System.out.println("Exemplo:");
        System.out.println("Imagine que um carro viaja por uma estrada");
        System.out.println("reta a uma velocidade constante de 20 m/s.");
        System.out.println("No instante inicial (t = 0 s), o carro está");
        System.out.println("a 50 metros de um posto de gasolina. Queremos");
        System.out.println("descobrir onde ele estará após 15 segundos de");
        System.out.println("movimento.");
        System.out.println("--------------------------------------");
        System.out.println("S = 50 + (20 x 15)");
        System.out.println("Após 15 segundos, o carro estará a 350 metros do ponto inicial. 🚗💨");
        System.out.println("======================================");
    }
}
