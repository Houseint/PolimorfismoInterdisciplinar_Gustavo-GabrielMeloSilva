import Fisica.*;
import Geo.*;
import Mat.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {
        calculoMU calculoMU = new calculoMU();
        definicaoVM definicaoVM = new definicaoVM();
        SysMec sysMec = new SysMec();
        calculo calculo = new calculo();
        Scanner Scanner = new Scanner(System.in);
        ArrayList<Float> resultadosMU = new ArrayList<>();
        ArrayList<Float> resultadosSysMec = new ArrayList<>();
        int op;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 -  Física");
            System.out.println("2 - Geografia");
            System.out.println("3 - Matemática");
            System.out.println("4 - Resultados em lista");
            System.out.println("5 - Sair");
            while (true) {
                while (!Scanner.hasNextInt()) {
                    System.out.println("Digite apenas números inteiros.");
                    Scanner.next();
                }
                op = Scanner.nextInt();
                Scanner.nextLine();
                if (op == 1 || op == 2 || op == 3 || op == 4 || op == 5) {
                    break;
                } else {
                    System.out.println("Escolha uma opção válida entre 1, 2 ,3, 4 e 5");
                }
            }
            switch (op) {
                case 1:
                    System.out.println("   Você escolheu a matéria FÍSICA📏. Escolha uma das 3 opções disponíveis: ");
                    System.out.println("1- Definição de Movimento Uniforme.");
                    System.out.println("2- Cálculo básico de Movimento Uniforme.");
                    System.out.println("3- Exemplo da aplicação do Movimento Uniforme em máquinas CNC a laser.");
                    while (true) {
                        while (!Scanner.hasNextInt()) {
                            System.out.println("Digite apenas números inteiros."); 
                            Scanner.next();
                        }
                        op = Scanner.nextInt();
                        Scanner.nextLine();
                        if (op == 1 || op == 2 || op == 3) {
                            break;
                        } else {
                            System.out.println("Escolha uma opção válida entre 1, 2 e 3");
                        }
                    }
                    if (op == 1) {
                        definicaoVM.defVM();
                    }
                    if (op == 2) {
                        System.out.println("Definição do cálculo(1) ou realização do cálculo(2)?");
                        op = Scanner.nextInt();
                        Scanner.nextLine();
                        if (op == 1) {
                            calculoMU.defVM();
                        }
                        if (op == 2) {
                            float resultado=calculoMU.formula();
                            resultadosMU.add(resultado);
                        }
                    }
                    if (op == 3) {
                        System.out.println("Definição do cálculo de  corte a laser(1) ou realização do cálculo(2)?");
                        op = Scanner.nextInt();
                        Scanner.nextLine();
                        if (op == 1) {
                            sysMec.defVM();
                        }
                        if (op == 2) {
                            float resultado=sysMec.formula();
                            resultadosSysMec.add(resultado);
                        }
                    }
                    break;

                case 2:
                    System.out.println("🌍 - - - Você escolheu a matéria de GEOGRAFIA - - - 🌍");
                    calculo.interacaoCart();
                    break;
                case 3:
                    BonusSalario.BonusSalario();
                    break;
                case 4:
                    System.out.println("Resultados dos cálculos de Movimento Uniforme:");
                    if (resultadosMU.isEmpty()) {
                        System.out.println("Nenhum resultado salvo ainda.");
                    } else {
                        for (int i = 0; i < resultadosMU.size(); i++) {
                            System.out.println((i + 1) + ": " + resultadosMU.get(i));
                        }
                    }
                    System.out.println("Resultados dos cálculos de CNC (SysMec):");
                    if (resultadosSysMec.isEmpty()) {
                        System.out.println("Nenhum resultado salvo ainda.");
                    } else {
                        for (int i = 0; i < resultadosSysMec.size(); i++) {
                            System.out.println((i + 1) + ": " + resultadosSysMec.get(i));
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
            }
        } while (op != 5    );
        Scanner.close();
    }
}

