import java.util.Scanner;

public class Aluno {
    String nome = "";
    int nota = 0;
    boolean verify = false;

    public Aluno(){}

    public Aluno(String nome, int nota){
        this.nome = nome;
        this.nota = nota;
    }

    Scanner quest = new Scanner(System.in);

    public void cadastrar(){
        System.out.println("Qual o nome do aluno?");
        nome = quest.next();
        System.out.println("Qual a nota do aluno?");
        nota = quest.nextInt();
        if (nota >= 0){
            this.verify = true;

        }
        else {
            System.out.println("Dados invalidos");
            cadastrar();
        }
    }

    public void alunosAprovados(){
        if (nota > 6){

        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Nota: " + nota;
    }
}
