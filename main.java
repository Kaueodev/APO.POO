public class main {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Ana", 30);
        Aluno aluno1 = new Aluno("Carlos", 22, "Big Data");

        pessoa1.exibirInfo();
        System.out.println("------------------");
        aluno1.exibirInfo();
    }
}