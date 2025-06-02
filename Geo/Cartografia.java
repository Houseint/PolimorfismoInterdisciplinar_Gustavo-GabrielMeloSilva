package Geo;
//metodos abstratos & get e set
public abstract class Cartografia{
    private int dMapa;
    private int dTerreno;
    private  int resultado;

    public int getdMapa(){
        return dMapa;
    }

    public int getdTerreno(){
        return dTerreno;
    }

    public void setdMapa(int dMapa){
        this.dMapa = dMapa;
    }

    public void setdTerreno(int dTerreno){
        this.dTerreno = dTerreno;
    }

    public int getResultado(){
        return resultado;
    }
    public void setResultado(int resultado){
        this.resultado = resultado;
    }

    public abstract void interacaoCart();
    public abstract int calculo();
}

