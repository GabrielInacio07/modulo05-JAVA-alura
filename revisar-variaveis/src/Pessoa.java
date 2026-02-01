public class Pessoa {

    private String nome;
    private double altura;
    private double peso;
    private char sexo;
    private int quantidadeDePassos;

    public Pessoa(String nome, double altura, double peso, char sexo,int quantidadeDePassos) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.quantidadeDePassos = quantidadeDePassos;
    }

    public int getQuantidadeDePassos() {
        return quantidadeDePassos;
    }

    public void setQuantidadeDePassos(int quantidadeDePassos) {
        this.quantidadeDePassos = quantidadeDePassos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", sexo=" + sexo +
                '}';
    }
}
