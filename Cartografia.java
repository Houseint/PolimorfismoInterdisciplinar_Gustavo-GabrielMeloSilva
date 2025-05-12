public abstract class Cartografia{
    private float e;
    private float dMapa;
    private float dterreno;//definindo os tipos de variaveis

    public float getTerreno(){
        return dterreno;
    }
    public void setEscala(float dterreno){
        this.dterreno = dterreno;
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

