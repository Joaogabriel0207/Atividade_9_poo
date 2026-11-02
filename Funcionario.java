import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;

@DatabaseTable(tableName = "funcionario")
public class Funcionario
{   
    @DatabaseField(generatedId = true)
    private int id;
    
    @DatabaseField
    private String nome;
    
    @DatabaseField
    private String cpf;
    
    @DatabaseField
    private double salario;
    
    @DatabaseField
    private String cargo;

    @DatabaseField
    private String turno;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, double salario, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                ", cargo='" + cargo + '\'' +
                (turno != null ? ", turno='" + turno + '\'' : "") +
                '}';
    }
}