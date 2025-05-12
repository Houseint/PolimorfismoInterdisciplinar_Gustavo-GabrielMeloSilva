import java.util.Scanner;
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
                    int escolha;
                    System.out.println("1-Defição de velocidade média");
                    System.out.println("2-Calcular velocidade média");
                    System.out.println("3-Listar velocidades armazenadas");
                    escolha = Scanner.nextInt();
                    
                    while(escolha != 1 && escolha != 2 && escolha != 3){
                        System.out.println("Opção inválida. Escolha 1 ou 2.");
                        escolha = Scanner.nextInt();
                    }
                    if (escolha == 1) {
                        vm.defVM();
                    }
                     if (escolha == 2) {
                    System.out.println(" Velocidade média");
                    System.out.println("Digite a distância percorrida(km):");
                    float d= Scanner.nextFloat();
                    Scanner.nextLine();
                    System.out.println("Digite o tempo gasto(horas):");
                    float t= Scanner.nextFloat();
                    Scanner.nextLine();
                    vm.setDistancia(d);
                    vm.setTempo(t);
                    v  = vm.formula();
                    velocidades.add(v);
                    System.out.println("A velocidade média é: " + v+"m/s");
                    }
                     if (escolha == 3) {
                        if (velocidades.isEmpty()) {
                            System.out.println("Nenhuma velocidade armazenada.");
                        } else {
                            System.out.println("Velocidades armazenadas: ");
                            for (float velocidade : velocidades) {
                                System.out.println(velocidade + " m/s");
                            }
                        }
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

