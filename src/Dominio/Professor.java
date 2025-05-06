package Dominio;

public class Professor {
    private String professorNome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor (String professorNome, String especialidade) {
        this.professorNome = professorNome;
        this.especialidade = especialidade;
    }

    public Professor (String professorNome, String especialidade, Seminario[] seminarios) {
        this(professorNome, especialidade);
        this.seminarios = seminarios;
    }

    public void imprimeProfessor() {
        System.out.println("### Professor ###");
        System.out.println("Nome: " + this.professorNome);
        System.out.println("Especialidade: " + this.especialidade);

        if (seminarios == null) {
            System.out.println("Sem seminário cadastrado\n");
            return;
        };

        System.out.println("Palestrante em:");
        for (Seminario seminario : seminarios) {
            System.out.print(seminario.getSeminarioTitulo() + "; ");
        }
        System.out.println("\n");
    }

    public String getProfessorNome() {
        return professorNome;
    }

    public void setProfessorNome(String professorNome) {
        this.professorNome = professorNome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
