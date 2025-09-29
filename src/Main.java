import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o seu número da chamada: ");
        int numerodechamada = scanner.nextInt();

        System.out.println("----------------------------------------");

        System.out.print("Digite a nota da prova 1: ");
        double notaum = scanner.nextDouble();

        System.out.print("Digite a nota da prova 2: ");
        double notadois = scanner.nextDouble();

        System.out.print("Digite a nota da prova 3: ");
        double notatres = scanner.nextDouble();

        System.out.print("Digite a nota da prova 4: ");
        double notaquatro = scanner.nextDouble();




        System.out.println("----------------------------------------");
        double calculomedia= (notaum + notadois + notatres + notaquatro) / 4;
        String mediafinal = String.format("%.2f",calculomedia);





        System.out.println("Boa tarde, " + nome + ", de número de chamada: " + numerodechamada);
        System.out.println("Suas notas foram respectivamente: ");
        System.out.println("Primeira nota: " +notaum);
        System.out.println("Segunda nota: " +notadois);
        System.out.println("Terceira nota: " + notatres);
        System.out.println("Quarta nota: " +notaquatro);
        System.out.println("----------------------------------------");
        System.out.println("Juntando as notas anteriores, e fazendo as operações necessárias, chegamos ao resultado da sua Média abaixo");
        System.out.println("Media Final: " + mediafinal);

        if (calculomedia >= 5){
            System.out.print("Parabéns você foi aprovado!!");
        } else if (calculomedia <=4){
            System.out.print("Infelizmente você foi reprovado...");
        } else  {
            System.out.print("Infelizmente você ficou de recuperação");
        }
    }
    }
