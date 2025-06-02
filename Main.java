import Fisica.*;
import Geo.*;
import Mat.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {
        //aqui eu instanciei os objetos de cada classe
        calculoMU calculoMU = new calculoMU();
        definicaoVM definicaoVM = new definicaoVM();
        defCart defCart = new defCart();
        SysMec sysMec = new SysMec();
        calculoCart calculoCart = new calculoCart();
        BonusSalario BonusSalario = new BonusSalario();
        Quiz Quiz = new Quiz();
        definicaoPor definicaoPor= new definicaoPor();
        IMC IMC = new IMC();
        Scanner Scanner = new Scanner(System.in);
        ArrayList<Float> resultadosMU = new ArrayList<>();
        ArrayList<Float> resultadosSysMec = new ArrayList<>();
        ArrayList<Integer> resultadoEscala = new ArrayList<>();
        ArrayList<Double> resultadosBonusSalario = new ArrayList<>();
        ArrayList<Double> resultadosIMC = new ArrayList<>();
        int op;
        //menu do while pra interação
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 -  Física");
            System.out.println("2 - Geografia");
            System.out.println("3 - Matemática");
            System.out.println("4 - Resultados em lista");
            System.out.println("5 - Sair");
            //validação de entrada
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
                        //validação de entrada
                        if (op == 1 || op == 2 || op == 3) {
                            break;
                        } else {
                            System.out.println("Escolha uma opção válida entre 1, 2 e 3");
                        }
                    }
                    if (op == 1) {
                        //aqui eu chamei o método
                        definicaoVM.defVM();
                    }
                    if (op == 2) {
                        System.out.println("Definição do cálculo(1) ou realização do cálculo(2)?");
                        op = Scanner.nextInt();
                        Scanner.nextLine();
                        //mini menu
                        while (op != 1 && op != 2) {
                            System.out.println("Escolha uma opção válida entre 1 e 2");
                            op = Scanner.nextInt();
                            Scanner.nextLine();
                        }
                        if (op == 1) {
                            calculoMU.defVM();
                        }
                        if (op == 2) {
                            //aqui eu adicionei o resultado no arrylist
                            float resultado=calculoMU.formula();
                            resultadosMU.add(resultado);
                        }
                    }
                    if (op == 3) {
                        System.out.println("Definição do cálculo de  corte a laser(1) ou realização do cálculo(2)?");
                        op = Scanner.nextInt();
                        Scanner.nextLine();
                        while (op != 1 && op != 2) {
                            System.out.println("Escolha uma opção válida entre 1 e 2");
                            op = Scanner.nextInt();
                            Scanner.nextLine();
                        }
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
                    System.out.println("Escolha as seguintes opções:");
                    System.out.println("1 - O que é Cartografia?");
                    System.out.println("2 - Cálculo de escala");
                    System.out.println("3 - Quiz sobre Cartografia");
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
                        defCart.interacaoCart();
                    }
                    if (op == 2) {
                        calculoCart.interacaoCart();
                        int resultado= calculoCart.calculo();
                        resultadoEscala.add(resultado);
                    }
                    if (op == 3) {
                        Quiz.interacaoCart();
                    }
                    break;
                case 3:
                    System.out.println("📐- - - Você escolheu a matéria de MATEMÁTICA - - -📐");
                    System.out.println("Escolha uma das opções: ");
                    System.out.println("1 - O que é porcentagem?");
                    System.out.println("2 - Cálculo de bõnus salarial.");
                    System.out.println("3 - Aplicação de porcentagem em IMC.");
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
                    if (op ==  1){
                        definicaoPor.def();
                    }
                    if (op == 2) {
                        System.out.println("Definição do  Bõnus Salarial(1) ou cálculo do Bônus Salarial(2)?");
                        op = Scanner.nextInt();
                        Scanner.nextLine();
                        while (op != 1 && op != 2) {
                            System.out.println("Escolha uma opção válida entre 1 e 2");
                            op = Scanner.nextInt();
                            Scanner.nextLine();
                        }
                        if (op == 1) {
                            BonusSalario.def();
                        }
                        if (op == 2) {
                            double resultado = BonusSalario.calcularPorcentagem();
                            resultadosBonusSalario.add(resultado);
                        }
                    }
                    if (op == 3) {
                        System.out.println("Definição do IMC(1) ou cálculo do IMC(2)?");
                        op = Scanner.nextInt();
                        Scanner.nextLine();
                        while (op != 1 && op != 2) {
                            System.out.println("Escolha uma opção válida entre 1 e 2");
                            op = Scanner.nextInt();
                            Scanner.nextLine();
                        }
                        if (op == 1) {
                            IMC.def();
                        }
                        if (op == 2) {
                            double resultado = IMC.calcularPorcentagem();
                            resultadosIMC.add(resultado);
                        }
                    }
                    break;
                case 4:
                    // o case 4 inteiro é onde estão os resultados dos cálculos sendo exibidos em formato de lista
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
                    System.out.println("Resultados dos cálculos de escala - CARTOGRAFIA");
                    if (resultadoEscala.isEmpty()) {
                        System.out.println("Nenhum resultado salvo ainda.");
                    } else {
                        for (int i = 0; i < resultadoEscala.size(); i++) {
                            System.out.println((i + 1)+":"+" 1" + ":" + resultadoEscala.get(i));
                        }
                    }
                    System.out.println("Resultados dos cálculos de Bônus Salarial:");
                    if (resultadosBonusSalario.isEmpty()) {
                        System.out.println("Nenhum resultado salvo ainda.");
                    } else {
                        for (int i = 0; i < resultadosBonusSalario.size(); i++) {
                            System.out.println((i + 1) + ": " + resultadosBonusSalario.get(i));
                        }
                    }
                    System.out.println("Resultados dos cálculos de IMC:");
                    if (resultadosIMC.isEmpty()) {
                        System.out.println("Nenhum resultado salvo ainda.");
                    } else {
                        for (int i = 0; i < resultadosIMC.size(); i++) {
                            System.out.println((i + 1) + ": " + resultadosIMC.get(i));
                        }
                    }
                    break;
                case 5:
                    // sai do sistema
                    System.out.println("Saindo...");
                    break;
            }
        } while (op != 5    );
        //fecha o scanner
        Scanner.close();
    }
}

