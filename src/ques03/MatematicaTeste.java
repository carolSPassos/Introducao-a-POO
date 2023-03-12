package ques03;

import java.util.Scanner;

public class MatematicaTeste {
    public static void main(String[] args) {

        Scanner escolha = new Scanner(System.in);
        int repetir;
        do {
            System.out.println("""
                    1 - somar
                    2 - subtrair
                    3 - dividir
                    4 - multiplicar
                    Escolha uma opção para ver o cálculo esperado entre os números 10 e 5: \s""");

            int opcaoEscolhida = escolha.nextInt();
            Matematica opcao = new Matematica();

            switch (opcaoEscolhida) {
                case 1 -> System.out.println("10 + 5 = " + opcao.soma());
                case 2 -> System.out.println("10 - 5 = " + opcao.subtracao());
                case 3 -> System.out.println("10 / 5 = " + opcao.divisao());
                case 4 -> System.out.println("10 * 5 = " + opcao.multiplicacao());
                default -> {
                    System.out.println("invalido");
                }
            }
            System.out.println("Digite 0 para repetir a operação ");
            repetir = escolha.nextInt();

        } while (repetir == 0);
        System.out.println("Fim");
    }

}
