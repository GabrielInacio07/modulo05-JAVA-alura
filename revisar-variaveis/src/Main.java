class Main{
    public static void main(String[] args) {
    System.out.println("Revisão de TIPOS/VARIÁVEIS");

        int quantidadeDePassos = 500;

        Pessoa people = new Pessoa("Gabriel",1.85,95.0,'M',300);

        if(people.getQuantidadeDePassos() < 500){
            System.out.println(people.getNome() + " você precisa aumentar a quantidade de passos");
        }else {
            System.out.println(people.getNome() + " você está dentro da meta exigida");
        }
    }
}