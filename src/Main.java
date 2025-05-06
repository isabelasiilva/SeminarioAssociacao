import Dominio.Aluno;
import Dominio.Local;
import Dominio.Professor;
import Dominio.Seminario;

public class Main {
    public static void main(String[] args) {
        // Criando local
        Local local1 = new Local("Vila Mariana");
        Local local2 = new Local("Consolação");
        Local local3 = new Local("Cambuci");

        // Criando seminarios
        Seminario seminario1 = new Seminario("Seminário 1", local1);
        Seminario seminario2 = new Seminario("Seminário 2", local2);
        Seminario seminario3 = new Seminario("Seminário 3", local3);

        // Criando professores
        Professor professor1 = new Professor("João", "Matematica", new Seminario[] {seminario1, seminario2});
        Professor professor2 = new Professor("Maria", "História", new Seminario[] {seminario1, seminario3});
        Professor professor3 = new Professor("Paulo", "Geografia");

        // Criando alunos
        Aluno aluno1 = new Aluno("Ana Luiza", 20, seminario1);
        Aluno aluno2 = new Aluno("Paulo", 23, seminario1);
        Aluno aluno3 = new Aluno("Ronaldo", 19, seminario2);
        Aluno aluno4 = new Aluno("Jessica", 21, seminario2);
        Aluno aluno5 = new Aluno("Amanda", 20);
        Aluno aluno6 = new Aluno("Luiz", 22);

        // Adicionando o array de alunos em seminário
        seminario1.setAlunos(new Aluno[] {aluno1, aluno2});
        seminario2.setAlunos(new Aluno[] {aluno3, aluno4});

        seminario1.imprimeSeminario();
        seminario2.imprimeSeminario();
        seminario3.imprimeSeminario();

        aluno1.imprimeAluno();
        aluno2.imprimeAluno();
        aluno5.imprimeAluno();

        professor1.imprimeProfessor();
        professor2.imprimeProfessor();
        professor3.imprimeProfessor();
    }
}