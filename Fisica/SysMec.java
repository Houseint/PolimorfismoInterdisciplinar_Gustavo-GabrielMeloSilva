package Fisica;

public class SysMec extends MU {
    public SysMec(){}
    @Override
    public void defVM(){
        System.out.println("Uma máquina CNC de corte a laser é equipada com um sistema de controle numérico computadorizado (CNC)");
        System.out.println("Utiliza um feixe de luz focado para cortar ou gravar materiais com precisão");
        System.out.println("O corte a laser CNC é usado para cortar metal com alta precisão.");
    }
    @Override
    public float formula(){
        float S;
        System.out.println("Máquina CNC de corte a laser!\n");
        System.out.println("Digite a velocidade de corte em mm/s: ");
        float v= getVMovel();
        System.out.println("Posição inicial em mm: ");
        float Si= getPInicial();
        System.out.println("Tempo em segundos que o corte demorou: ");
        float t= getTempo();
        return S= Si + v * t;
        
    }
}