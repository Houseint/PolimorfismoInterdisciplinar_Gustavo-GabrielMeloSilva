public abstract class Cartografia{
    private float e;
    private float dMapa;
    private float dterreno;//definindo os tipos de variaveis

    public float getEscala(){
        return e;
    }
    public void setEscala(float e){
        this.e = e;
    }
    public float getDistanciaMapa(){
        return dMapa;
    }
    public void setDistanciaMapa(float dMapa){
        this.dMapa = dMapa;
    }
    public abstract void def();
    public abstract float escala();
}

