package Geo;

public class defCart extends Cartografia {
    @Override
    public void interacaoCart(){
        System.out.println("==========================================================================================");
        System.out.println("                  🗺️ ! Vamos conhecer mais sobre a Cartografia ! 🗺️");
        System.out.println("==========================================================================================");
        System.out.println("A cartografia é a ciência, a técnica e a arte de representar o espaço geográfico em um");
        System.out.println("suporte que possa condensar e organizar a complexidade do mundo. Em sua definição");
        System.out.println("básica, ela engloba desde o desenho de mapas até a interpretação dos dados");
        System.out.println("representados, transformando dimensões reais (geralmente tridimensionais) em");
        System.out.println("representações planas que podemos analisar e utilizar no cotidiano. Essa representação");
        System.out.println("vai além da estética: envolve rigor numérico pela definição de escalas, projeções,");
        System.out.println("coordenadas e simbologia.");
        System.out.println("==========================================================================================");

    }
    @Override
    public int calculo(int dMapa, int dTerreno){
        return dTerreno/dMapa;
    }
}