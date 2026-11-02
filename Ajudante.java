public class Ajudante extends Funcionario {

    public Ajudante() {
        super();
        setCargo("AJUDANTE");
    }

    public Ajudante(String nome, String cpf, double salario, String turno) {
        super(nome, cpf, salario, "AJUDANTE");
        setTurno(turno);
    }
}