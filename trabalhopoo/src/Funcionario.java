public class Funcionario extends Pessoa {
    private double salario;
    private Cargo cargo;

    public Funcionario (String nome, double salario, Cargo cargo) {
        super(nome);
        this.salario = salario;
        this.cargo = cargo;
    }

    double mudarSalario(double s) {
        this.salario = s;
        return this.salario;
    }
}
