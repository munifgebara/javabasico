package primeiroprojetojava;

import java.util.Date;
import java.util.Scanner;

public class PrimeiroProjetoJava {

    public static void main(String[] args) {

        for (int n = 0; n < 10; n++) { // n++ é o mesmo que n=n+1
            if (n < 5 || n == 6) {   // == igualdade !=diferente >= <=  > <
                System.out.println("Tabuada Fácil");
            } else {
                System.out.println("Tabuada Difícil");
            }
            if (n<2){
                continue;
            }
            if (n>7){
                break;
            }
            for (int i = 0; i < 10; i = i + 1) {
                int r = n * i;
                System.out.println(n + " x " + i + " = " + r);
                if (n == 9 && i == 9) {
                    System.out.println("FIM");
                }
            }
        }

        int o = 1;
        while (o < 10) {
            System.out.println("--->" + o);
            o *= 2; // o mesmo que o=o*2;
        }

        do {
            System.out.println("--->" + o);
            o = o / 2; // o mesmo que o=o*2;
        } while (o > 1);

        for (o = 1; o < 10; o = o * 2) {
            System.out.println("---->" + o);
        }

        int v[] = {1, 2, 3, 5, 8, 13, 21};
        try {
            System.out.println("--->" + v[0]);
            System.out.println("--->" + v.length);
            System.out.println("--->" + v[7]);

        } catch (Exception ex) {
            System.out.println("Problemas, o array é muito curto");
        } finally {
            System.out.println("---- -----");
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println("---> " + v[i]);
        }
        for (int x : v) {
            System.out.println("--->" + x + " " + (x % 2 == 0 ? "Par" : "Impar"));
//                if ((x % 2) == 0) {
//                    System.out.println("Par");
//                } else {
//                    System.out.println("Impar");
//                }
        }

        int opcao = 6;

        switch (opcao) {
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("três");
                break;
            case 4:
                System.out.println("quatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            case 6:
                System.out.println("seis");
                break;
            case 7:
                System.out.println("sete");
                break;
            case 8:
                System.out.println("oito");
                break;
            case 9:
                System.out.println("nove");
                break;
            default:
                System.out.println("outro");
        }

    }

    public static void main1(String[] args) {

        String s;
        int a, b, c;
        int x = 6, y, z = 2;
        long l = 100;
        double pi = 3.14;
        boolean status = true; // false

        Scanner leitor = new Scanner(System.in); //
        System.out.println("Olá Mundo!"); // writeln
        System.out.println("Qual é seu nome?");
        String nome = leitor.next();
        System.out.println("Olá " + nome);
        System.out.println("Qual ano você nasceu?");
        int ano = leitor.nextInt();
        int idade = 2016 - ano;
        System.out.println(nome + " você completará " + idade + " anos em 2016.");

    }

}
