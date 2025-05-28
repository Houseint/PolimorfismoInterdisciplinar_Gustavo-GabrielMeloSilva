package Geo;

public abstract class Cartografia{
    private int dMapa;
    private int dTerreno;

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

    public abstract void interacaoCart();
    public abstract int calculo();
}

