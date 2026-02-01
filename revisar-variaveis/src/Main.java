import D01.PessoaEstudante;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("Revisão de TIPOS/VARIÁVEIS");
        System.out.println("Exercício fazendo CASTING DE VALORES");
        Scanner input = new Scanner(System.in);
        double estoque = 0;

        System.out.println("Digite a quantidade de estoque a inserir");
        estoque = Double.parseDouble(input.nextLine());

        System.out.println("Valor passado pelo usuário: " + estoque);
        System.out.println("Valor incrementado no estoque em inteiro: " + (int) estoque);


    }
}