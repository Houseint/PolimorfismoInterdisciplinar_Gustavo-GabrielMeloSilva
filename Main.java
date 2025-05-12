import java.util.Scanner;

public class  Main{
    public static void main (String[]Args){
        defVM vm = new defVM();
        Scanner Scanner = new Scanner(System.in);
        int op;
        float v;
        
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Definir Velocidade Média");
            System.out.println("2 - Sair");
            op = Scanner.nextInt();
            switch(op){
                case 1:
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
                    
                    
                break;
                case 2:
                System.out.println("Saindo...");
            }
        } while(op != 2);
        Scanner.close();

    }
}