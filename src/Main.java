import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema Escolar");
        Scanner c1 = new Scanner(System.in);
        Aluno aluno = new Aluno();
        ArrayList <Aluno> lista = new ArrayList<>();

        while (true) {
            System.out.println("[ 1 ] Cadastrar Aluno");
            System.out.println("[ 2 ] Ver alunos");
            System.out.println("[ 3 ] Mostrar aprovados");
            int menu = c1.nextInt();

            switch (menu) {
                case 1:
                    aluno.cadastrar();
                    lista.add(new Aluno(aluno.nome, aluno.nota));
                    break;

                case 2:
                    for (Aluno a : lista) {
                        System.out.println(a); // chama toString() de cada aluno
                    }
                    break;
            }
        }
    }
}