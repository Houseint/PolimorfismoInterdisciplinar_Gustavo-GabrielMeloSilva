package Geo;

import java.util.Scanner;

public class calculoCart extends Cartografia {
    public calculoCart(){};
    @Override
    public void interacaoCart(){
        System.out.println(" ");
    }
    @Override
    public int calculo(){
        //calculo de escala cartográfica
        Scanner scanner = new Scanner(System.in);
        System.out.println("🗺️ - - - Vamos calcular a escala cartográfica - - - 🗺️");
        System.out.println("Atente-se com as seguintes informações: ");
        System.out.println("1 - A distância real estará como centímetros;");
        System.out.println("2 - A fórmula é:");
        System.out.println("E = d/D");
        System.out.println("----------");
        System.out.println("E -> Escala");
        System.out.println("d -> Distância no mapa");
        System.out.println("D -> Distância no terreno real");
        System.out.println("----------");
        System.out.println("Digite a distância representada no mapa:");
        int dMapa = scanner.nextInt();
        setdMapa(dMapa);
        System.out.println("Digite a distância representada no terreno real:");
        int dTerreno = scanner.nextInt();
        setdTerreno(dTerreno);
        System.out.println("A escala cartográfica, segundo os dados calculados é:");
        int resultado = dTerreno/dMapa;
        setResultado(resultado);
        System.out.println("1:"+resultado);
        return resultado;
    }
}