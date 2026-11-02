public class Garcom extends Funcionario {

    public Garcom() {
        super();
        setCargo("GARCOM");
    }

    public Garcom(String nome, String cpf, double salario) {
        super(nome, cpf, salario, "GARCOM");
    }
}