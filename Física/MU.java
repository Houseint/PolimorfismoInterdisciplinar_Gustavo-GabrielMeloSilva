package Física;
public abstract class MU{
    private float v;
    private float d;
    private float t;
    

    public float getVelocidade(){
        return v;
    }
    public void setVelocidade(float v){
        this.v = v;
    }

    public float getDistancia(){
        return d;
    }

    public void setDistancia(float d){
        this.d = d;
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