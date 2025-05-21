import Fisica.*;
import Geo.*;
import java.util.ArrayList;
import java.util.Scanner;

public class  Main{
    public static void main (String[]Args){
        calculoMU calculoMU = new calculoMU();
        definicaoVM definicaoVM = new definicaoVM();
        SysMec sysMec = new SysMec();
        calculo calculo = new calculo();
        Scanner Scanner = new Scanner(System.in);
        ArrayList<Float> velocidades = new ArrayList<>();
        int op;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 -  Física");
            System.out.println("2 - Geografia");
            System.out.println("3 - Sair");
            op = Scanner.nextInt();
            while(true){
                while(!Scanner.hasNextInt()){
                System.out.println("Digite apenas números inteiros.");
                Scanner.next();
                }
                op=Scanner.nextInt();
                if (op == 1 || op== 2 || op == 3 || op == 4){
                break;
                }else{
                    System.out.println("Escolha uma opção válida entre 1, 2 ,3 e 4.");
                }
            }
            
            switch(op){
                case 1:
                    System.out.println("   Você escolheu a matéria Física📏. Escolha uma das 3 opções disponíveis: ");
                    System.out.println("1- Definição de Movimento Uniforme.");
                    System.out.println("2- Cálculo básico de Movimento Uniforme.");
                    System.out.println("3- Exemplo da aplicação do Movimento Uniforme em máquinas CNC a laser.");
                    op = Scanner.nextInt();
                    Scanner.nextLine();
                        while(true){
                            while(!Scanner.hasNextInt()){
                            System.out.println("Digite apenas números inteiros.");
                            Scanner.next();
                            }
                            op=Scanner.nextInt();
                            if (op == 1 || op== 2 || op == 3){
                            break;
                            }else{
                                System.out.println("Escolha uma opção válida entre 1, 2 e 3");
                            }
                        }
                        if(op == 1){
                            definicaoVM.defVM();
                        }
                break;

                case 2:
                    System.out.println("🌍 - - - Você escolheu a matéria de GEOGRAFIA - - - 🌍");
                    
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

