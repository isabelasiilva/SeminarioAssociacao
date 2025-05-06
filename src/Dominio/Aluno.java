package Dominio;

public class Aluno {
    private String alunoNome;
    private int idade;
    private Seminario SeminarioNome;

    public Aluno (String alunoNome, int idade) {
        this.alunoNome = alunoNome;
        this.idade = idade;
    }

    public Aluno (String alunoNome, int idade, Seminario SeminarioNome) {
        this(alunoNome, idade);
        this.SeminarioNome = SeminarioNome;
    }

    public void imprimeAluno() {
        System.out.println("### Aluno ###");
        System.out.println("Nome: " + this.alunoNome);
        System.out.println("Idade: " + this.idade);

        if (SeminarioNome == null) {
            System.out.println("Sem seminário cadastrado \n");;
        } else {
            System.out.println("Participará do " + this.SeminarioNome.getSeminarioTitulo() + "\n");
        }
    }

    public String getAlunoNome() {
        return alunoNome;
    }

    public void setAlunoNome(String alunoNome) {
        this.alunoNome = alunoNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminarioNome() {
        return SeminarioNome;
    }

    public void setSeminarioNome(Seminario seminarioNome) {
        this.SeminarioNome = seminarioNome;
    }
}
