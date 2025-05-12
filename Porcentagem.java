public  abstract class Porcentagem {

    private float a;
    private float b;

    //Valor - Método GET e SET
    public float getValor(){
        return a;
    }

    public void setValor(float a){
        this.a = a;
    }

    //Valor final - Método GET e SET
    public float getSegValor(){
        return b;
    }

    public void setSegValor(float b){
        this.b = b;
    }

    //Métodos abstratos
    public abstract double calcularPorcentagem();
    public abstract void def();
}
