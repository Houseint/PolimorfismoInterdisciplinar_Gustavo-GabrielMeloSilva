package Geo;
import java.util.Scanner;
public class longlat extends Cartografia {
    @Override
    public void interacaoCart() {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("==========================================================================================");
        System.out.println("                                 Latitude e Longitude                                     ");
        System.out.println("==========================================================================================");
        System.out.println("• Latitude: São linhas imaginárias horizontais que indicam a distância em graus em");
        System.out.println("relação ao Equador. Elas variam de 0° (no Equador) até 90° (nos polos Norte e Sul).");
        System.out.println("Os paralelos são as linhas que acompanham essas medidas, como o Trópico de Câncer");
        System.out.println("e o Trópico de Capricórnio.");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("• Longitude: São linhas imaginárias verticais que indicam a distância em graus a partir");
        System.out.println("do Meridiano de Greenwich, que é a referência inicial (0°). Elas vão até 180° para leste");
        System.out.println("e 180° para oeste. Os meridianos ajudam a definir fusos horários e coordenadas");
        System.out.println("exatas em mapas.");
    }
    @Override
    public int calculo(int dMapa, int dTerreno) {
        
    }
}