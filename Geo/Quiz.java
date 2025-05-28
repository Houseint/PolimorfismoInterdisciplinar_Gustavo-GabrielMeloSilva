package Geo;
import java.util.Scanner;
public class Quiz extends Cartografia {
    @Override
    public void interacaoCart() {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("==========================================================================================");
        System.out.println("                         📖 - - - Quiz de Cartografia - - - 💡                           ");
        System.out.println("==========================================================================================");
   }
    @Ove rride
    public int calculo(){
        return getdTerreno()/getdMapa();
    }
}