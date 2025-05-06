package Dominio;

public class Seminario {
    private String seminarioTitulo;
    private Local local;
    private Aluno[] alunos;

    public Seminario(String seminarioTitulo, Local local) {
        this.seminarioTitulo = seminarioTitulo;
        this.local = local;
    }

    public Seminario(String seminarioTitulo, Local local, Aluno[] alunos) {
        this(seminarioTitulo, local);
        this.alunos = alunos;
    }

    public void imprimeSeminario() {
        System.out.println("### Seminário ###");
        System.out.println("Nome: " + this.seminarioTitulo);

        System.out.println("Endereço: " + this.local.getEndereco());
        if (alunos == null) {
            System.out.println("Sem alunos cadastrados\n");
            return;
        }

        System.out.println("Alunos cadastrados:");
        for (Aluno aluno : alunos) {
            System.out.print(aluno.getAlunoNome() + "; ");
        }
        System.out.println("\n");
    }

    public String getSeminarioTitulo() {
        return seminarioTitulo;
    }

    public void setSeminarioTitulo(String seminarioTitulo) {
        this.seminarioTitulo = seminarioTitulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
