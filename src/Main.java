import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String R; //validação (S/N)
        String mensagem = "\u001B[31mINVALIDO\u001B[0m"; //Mensagem invalido em vermelho

        Scanner scan = new Scanner(System.in);

        // Linhas horizontais
        String linhaHorizontal = "-----------------------------";
        String linhaHorizontalCurta = "-----------------------------";

        System.out.println(linhaHorizontal);
        System.out.println("| Programa de decomposição |");
        System.out.println("| de células               |");
        System.out.println(linhaHorizontal);

        do {
            System.out.println("Escreva o valor que deseja decompor -> ");
            int N = scan.nextInt(); //R$100, R$50, R$20, R$10, R$5, R$2 e R$1.
            scan.nextLine();

            if (N > 0 && N < 1000000) {

                System.out.println("\u001B[32m-------\u001B[0m");
                System.out.println("\u001B[32m|\u001B[0m" + "\u001B[32m" + N + "\u001B[0m" + "\u001B[32m|\u001B[0m");
                System.out.println("\u001B[32m-------\u001B[0m");

                System.out.println(linhaHorizontalCurta);
                System.out.println("| " + N / 100 + " nota(s) de R$ 100,00" + " |");
                N %= 100;
                System.out.println("| " + N / 50 + " nota(s) de R$ 50,00" + "   |");
                N %= 50;
                System.out.println("| " + N / 20 + " nota(s) de R$ 20,00" + "   |");
                N %= 20;
                System.out.println("| " + N / 10 + " nota(s) de R$ 10,00" + "   |");
                N %= 10;
                System.out.println("| " + N / 5 + " nota(s) de R$ 5,00" + "    |");
                N %= 5;
                System.out.println("| " + N / 2 + " nota(s) de R$ 2,00" + "    |");
                N %= 2;
                System.out.println("| " + N + " nota(s) de R$ 1,00" + "    |");
                System.out.println(linhaHorizontalCurta);
            } else {
                System.out.println("\n" + mensagem + "\n"); //Mensagem em vermelho
            }

            System.out.println("Deseja continuar? (" + "\u001B[34m S \u001B[0m" + "/" + "\u001B[31m N \u001B[0m)"); //Validação colorido
            R = scan.nextLine();
        }while (R.equalsIgnoreCase("S"));

        System.out.println(linhaHorizontal);
        scan.close();
    }
}
