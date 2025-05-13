import java.util.Scanner;

import Física.defVM;

import java.util.ArrayList;

public class  Main{
    public static void main (String[]Args){
        defVM vm = new defVM();
        Scanner Scanner = new Scanner(System.in);
        ArrayList<Float> velocidades = new ArrayList<>();
        int op;
        float v;
        
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Velocidade Média");
            System.out.println("2 - Escala");
            System.out.println("3 - Sair");
            op = Scanner.nextInt();
            switch(op){
                case 1:
                    
                break;

                case 2:
                    
                break;
                case 3:
                System.out.println("Saindo...");
                break;
            }
        } while(op != 3);
        Scanner.close();
    }
}

