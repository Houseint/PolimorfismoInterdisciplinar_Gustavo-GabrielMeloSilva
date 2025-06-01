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
        System.out.println("- - - - - - - - ");
        System.out.println("'Quanto mede cada continente?'");
        System.out.println("- - -");
        System.out.println("• 1 - Ásia: 44,5 milhões de km²");
        System.out.println("• 2 - América: 42,5 milhões de km²");
        System.out.println("• 3 - África: 30,3 milhões de km²");
        System.out.println("• 4 - Antártida: 13,6 milhões de km²");
        System.out.println("• 5 - Europa: 10,5 milhões de km²");
        System.out.println("• 6 - Oceania: 8,5 milhões de km²");
        System.out.println("- - - - - - - - ");
        System.out.println("'Quais são os instrumentos da cartografia?'");
        System.out.println("- - -");
        System.out.println("• Bússola – Indica a direção e ajuda na orientação em campo.");
        System.out.println("• GPS (Sistema de Posicionamento Global) – Permite determinar coordenadas geográficas com precisão.");
        System.out.println("• Altímetro – Mede a altitude de um ponto em relação ao nível do mar.");
        System.out.println("• Teodolito – Usado na topografia para medir ângulos horizontais e verticais.");
        System.out.println("• Estação total – Combina teodolito e distanciômetro para medições mais precisas.");
        System.out.println("• Drones – Capturam imagens aéreas e mapeiam terrenos.");
        System.out.println("• Imagens de satélite – Fornecem dados para a criação de mapas detalhados.");
        System.out.println("• Curvímetro – Mede distâncias em mapas.");
        System.out.println("• Planímetro – Calcula áreas em mapas.");
        System.out.println("• Software de SIG (Sistemas de Informação Geográfica) – Processa e analisa dados espaciais, permitindo criar mapas digitais.");
        System.out.println("==========================================================================================");

    }
    @Override
    public int calculo(){
        return getdMapa()/getdTerreno();
    }
}