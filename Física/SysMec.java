package Física;

public class SysMec extends MU {
    public SysMec(){}
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