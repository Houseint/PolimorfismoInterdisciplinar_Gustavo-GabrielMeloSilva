package Geo;

import java.util.Scanner;

public class calculo extends Cartografia {
    private int dMapa;
    private int dTerreno;
    @Override
    public int calculo(){
        return dTerreno/dMapa;
    }
    @Override
    public void interacaoCart(){
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
        System.out.println("Digite a distância representada no terreno real:");
        int dTerreno = scanner.nextInt();
        System.out.println("A escala cartográfica, segundo os dados calculados é:");
        int resultado = calculo();
        System.out.println("1:"+resultado);
    }
}