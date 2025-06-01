package Geo;
import java.util.Scanner;
public class Quiz extends Cartografia {
    @Override
    public void interacaoCart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========================================================================================");
        System.out.println("                         📖 - - - Quiz de Cartografia - - - 💡                           ");
        System.out.println("==========================================================================================");
        System.out.println("Vamos testar o seu conhecimento em Cartografia: ");
        System.out.println("- - - - - - - - - -");
        //Pergunta 1
        System.out.println("1) Qual instrumento é utilizado para medir a altitude?");
        System.out.println("a) Bússola");
        System.out.println("b) Teodolito");
        System.out.println("c) GPS");
        System.out.println("d) Altímetro");
        String pergunta1 = scanner.nextLine();
        //Pergunta 2
        System.out.println("2) Qual é o maior continente em extensão territorial?");
        System.out.println("a) Ásia");
        System.out.println("b) Europa");
        System.out.println("c) África");
        System.out.println("d) América");
        String pergunta2 = scanner.nextLine();
        //Pergunta 3
        System.out.println("3) O que determina coordenadas geográficas com precisão?");
        System.out.println("a) Curvímetro");
        System.out.println("b) Drones");
        System.out.println("c) GPS");
        System.out.println("d) Pauzinhos");
        String pergunta3 = scanner.nextLine();
        //Resposta 1
        System.out.println("Pergunta 1:");
        if (pergunta1.equalsIgnoreCase("d")) {
            System.out.println("Você acertou, a resposta correta é:");
            System.out.println("d) Altímetro");
        } else {
            System.out.println("Resposta errada...");
            System.out.println("A resposta correta seria a alternativa:");
            System.out.println("d) Altímetro");
        }
        //Resposta 2
        System.out.println("Pergunta 2:");
        if (pergunta2.equalsIgnoreCase("a")) {
            System.out.println("Você acertou, a resposta correta é:");
            System.out.println("a) Ásia");
        } else {
            System.out.println("Resposta errada...");
            System.out.println("A resposta correta seria a alternativa:");
            System.out.println("a) Ásia");
        }
        //Resposta 3
        System.out.println("Pergunta 3:");
        if (pergunta3.equalsIgnoreCase("c")) {
            System.out.println("Você acertou, a resposta correta é:");
            System.out.println("c) GPS");
        } else {
            System.out.println("Resposta errada...");
            System.out.println("A resposta correta seria a alternativa:");
            System.out.println("c) GPS");
        }

   }
    @Override
    public int calculo(){
        return getdTerreno()/getdMapa();
    }
}