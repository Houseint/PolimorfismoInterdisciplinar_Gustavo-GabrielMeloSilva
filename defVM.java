public class defVM extends MU {
    public defVM(){}
    @Override
    public void defVM(){
        System.out.println("A velocidade média é uma grandeza que mede a rapidez da deslocação de um corpo num determinado intervalo de tempo médio. Ela é definida como a razão entre o deslocamento e o intervalo de tempo em que acontece algum movimento.");
    }
        @Override
    public float formula(){
        return getDistancia()/getTempo();
        
    }
}

