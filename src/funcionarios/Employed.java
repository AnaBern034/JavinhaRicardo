package funcionarios;

public class Employed {
    private String nome;
    private double salario;
    private String nivel;

    public Employed() {
    }

    public Employed(String nome, String nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public Employed(String nome, double salario, String nivel) {
        this.nome = nome;
        this.salario = salario;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
