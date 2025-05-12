import java.util.Scanner;

public class  Main{
    public static void main (String[]Args){
        defVM vm = new defVM();
        Scanner Scanner = new Scanner(System.in);
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
                    int escolha;
                    System.out.println("1-Defição de velocidade média");
                    System.out.println("2-Calcular velocidade média");
                    escolha = Scanner.nextInt();
                    
                    while(escolha != 1 && escolha != 2){
                        System.out.println("Opção inválida. Escolha 1 ou 2.");
                        escolha = Scanner.nextInt();
                    }
                    if (escolha == 1) {
                        vm.defVM();
                    }
                     if (escolha == 2) {
                    System.out.println(" Velocidade média");
                    System.out.println("Digite a distância percorrida:");
                    float d= Scanner.nextFloat();
                    Scanner.nextLine();
                    System.out.println("Digite o tempo gasto:");
                    float t= Scanner.nextFloat();
                    Scanner.nextLine();
                    vm.setDistancia(d);
                    vm.setTempo(t);
                    v  = vm.formula();
                    System.out.println("A velocidade média é: " + v);
                    }    
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

