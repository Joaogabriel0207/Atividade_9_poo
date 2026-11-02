public class Gerente extends Funcionario {

    public Gerente() {
        super();
        setCargo("GERENTE");
    }

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario, "GERENTE");
    }
}