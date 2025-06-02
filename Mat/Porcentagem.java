package Mat;

public  abstract class Porcentagem {
//método abstrato & get e set
    private double a;
    private double b;
    private double r;

    public double getValor(){
        return a;
    }

    public void setValor(double a){
        this.a = a;
    }


    public double getSegValor(){
        return b;
    }

    public void setSegValor(double b){
        this.b = b;
    }
    public double getResultado(){
        return r;
    }
    public void setResultado(double r){
        this.r=r;
    }


    public abstract double calcularPorcentagem();
    public abstract void def();
}
