package Fisica;
public class definicaoVM extends MU {
    public definicaoVM(){}
    @Override
    public void defVM(){
        System.out.println("A velocidade uniforme é quando um objeto se desloca mantendo sempre o mesmo valor de velocidade, ou seja, sem acelerar nem desacelerar.");
    }
        @Override
    public float formula(){
        float S = getPInicial() + getVMovel() * getTempo();
        return S;
    }
}

