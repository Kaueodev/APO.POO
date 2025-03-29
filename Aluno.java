public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, int idade, String curso){
        super(nome, idade);
        this.curso = curso;
    }

    @Override
    public void exibirInfo(){
        System.out.println("Aluno");
        super.exibirInfo();
        System.out.println("Curso:" + curso);
    }
}
