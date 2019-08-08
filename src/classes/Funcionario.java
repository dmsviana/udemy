package classes;

public class Funcionario {
    private String id;
    private String nome;
    private double salario;

    public Funcionario (String id, String nome, double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double incrementarPorcentagem(double porcentagem){
        return this.salario += (this.salario * porcentagem) / 100;
    }
    public String toString() {
        return id
                + ", "
                + nome
                + ", "
                + String.format("%.2f", salario);
    }

}
