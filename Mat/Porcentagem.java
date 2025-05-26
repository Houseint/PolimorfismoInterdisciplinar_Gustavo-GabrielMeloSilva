package Mat;

public  abstract class Porcentagem {

    private double a;
    private double b;
    private double r;
    //Valor - Método GET e SET
    public double getValor(){
        return a;
    }

    public void setValor(double a){
        this.a = a;
    }

    //Valor final - Método GET e SET
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

    //Métodos abstratos
    public abstract double calcularPorcentagem();
    public abstract void def();
}
