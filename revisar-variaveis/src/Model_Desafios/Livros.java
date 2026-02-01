package Model_Desafios;

public class Livros {

    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private double preco;
    private char categoria;

    public Livros(String titulo, String autor, int numeroDePaginas, double preco, char categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public double getPreco() {
        return preco;
    }

    public char getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                ", preco=" + preco +
                ", categoria=" + categoria +
                '}';
    }
}
