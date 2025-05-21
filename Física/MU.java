package Física;
public abstract class MU{
    private float S;
    private float Si;
    private float v;
    private float t;
    

    public float getPFInal(){
        return S;
    }
    public void setPFinal(float S){
        this.S = S;
    }

    public float getPInicial(){
        return Si;
    }

    public void setPInicial(float Si){
        this.Si = Si;
    }

    public float getVMovel(){
        return v;
    }

    public void setVMovel(float v){
        this.v = v;
    }

    public float getTempo(){
        return t;
    }

    public void setTempo(float t){
        this.t = t;
    }
    
    public abstract void defVM(); 
    public abstract float formula(); 
}