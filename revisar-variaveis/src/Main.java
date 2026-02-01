import Model_Desafios.Livros;

import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("Revisão de TIPOS/VARIÁVEIS");
        System.out.println("Exercício fazendo Cadastro de livros por categoria mapeada");
        Scanner input = new Scanner(System.in);

        ArrayList<Character> arrayCategories = new ArrayList<>();
        arrayCategories.add('F');
        arrayCategories.add('N');
        arrayCategories.add('T');
        arrayCategories.add('H');

        System.out.println("Digite o Título do livro");
        String titulo = input.nextLine();

        System.out.println("Digite o Autor do livro");
        String autor = input.nextLine();

        System.out.println("Digite o Número de paginas do livro");
        int paginas = Integer.parseInt(input.next());

        System.out.println("Digite o Preço do livro");
        double preco = Double.parseDouble(input.next());

        System.out.println("Digite a Categoria do livro");
        char categoria = input.next().charAt(0);

        Livros book = new Livros(titulo,autor,paginas,preco,categoria);

        if (arrayCategories.contains(book.getCategoria())) {
            System.out.println("Livro adicionado");
            System.out.println(book);
        } else {
            System.out.println("Categoria do livro inválida!");
        }


        input.close();
    }
}