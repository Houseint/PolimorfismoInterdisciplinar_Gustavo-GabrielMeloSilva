package Fisica;
import java.util.Scanner;
public class SysMec extends MU {
    public SysMec(){}
    private static final Scanner Scanner = new Scanner(System.in);
    @Override
    public void defVM(){
        System.out.println("Uma máquina CNC de corte a laser é equipada com um sistema de controle numérico computadorizado (CNC)");
        System.out.println("Utiliza um feixe de luz focado para cortar ou gravar materiais com precisão");
        System.out.println("O corte a laser CNC é usado para cortar metal com alta precisão.");
    }
    @Override
    public float formula(){
        System.out.println("Máquina CNC de corte a laser!\n");
        System.out.println("Digite a velocidade de corte em mm/s: ");
        float v= Scanner.nextFloat();
        setVMovel(v);
        System.out.println("Posição inicial em mm: ");
        float Si= Scanner.nextFloat();
        setPInicial(Si);
        System.out.println("Tempo em segundos que o corte demorou: ");
        float t= Scanner.nextFloat();
        setTempo(t);
        float S= getPInicial() + getVMovel() * getTempo();
        System.out.println("Após "+t+" segundos, a máquina CNC de corte a laser cortou "+S+" mm do ponto inicial!");
        return S;
    }
}