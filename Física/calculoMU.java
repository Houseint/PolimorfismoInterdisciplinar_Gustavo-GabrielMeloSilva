package Física;

public class calculoMU extends MU {
    public calculoMU(){}
    @Override
    public float formula(){
        System.out.println("Calcule a velocidade média de um avião: ");
        System.out.println("Digite a distância percorrida (em km): ");
        float d = getDistancia();
        System.out.println("Digite o tempo gasto (em horas): ");
        float t = getTempo();
        float v = d / t;
        return v;
    }
    @Override
    public void defVM(){
        System.out.println("======================================");
        System.out.println("      CÁLCULO DA VELOCIDADE MÉDIA     ");
        System.out.println("======================================");
        System.out.println("Fórmula: Vm = D / T");
        System.out.println("--------------------------------------");
        System.out.println("Onde:");
        System.out.println(" - Vm = Velocidade média");
        System.out.println(" - D  = Distância percorrida");
        System.out.println(" - T  = Tempo gasto");
        System.out.println("--------------------------------------");
        System.out.println("Exemplo:");
        System.out.println(" Um carro percorreu 200 km em 4 horas.");
        System.out.println(" Velocidade média = 200 / 4 = 50 km/h");
        System.out.println("--------------------------------------");
        System.out.println(" Isso significa que, em média, o carro");
        System.out.println(" percorreu 50 km a cada hora! 🚗💨");
        System.out.println("======================================");
    }
}
