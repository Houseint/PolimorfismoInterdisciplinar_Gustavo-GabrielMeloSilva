import Física.defVM;
import Geografia.calculo;
import java.util.ArrayList;
import java.util.Scanner;

public class  Main{
    public static void main (String[]Args){
        defVM vm = new defVM();
        calculo calculo = new calculo();
        Scanner Scanner = new Scanner(System.in);
        ArrayList<Float> velocidades = new ArrayList<>();
        int op;
        float v;
        
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 -  Física");
            System.out.println("2 - Geografia");
            System.out.println("3 - Sair");
            op = Scanner.nextInt();
            switch(op){
                case 1:
                    System.out.println("Trabalho pro fofucho;");
                break;

                case 2:
                    calculo.interacaoCart();

                break;
                case 3:
                System.out.println("Saindo...");
                break;
            }
        } while(op != 3);
        Scanner.close();
    }
}

