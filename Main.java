import java.util.List;

public class Main {
    public static void main(String[] args) {
        Database db = new Database("restaurante.db");
        FuncionarioRepository repo = new FuncionarioRepository(db);

        System.out.println("TESTE DE CREATE");
        Gerente gerente = new Gerente("Lucas Lima", "251.584.269-77", 5700.00);
        Garcom garcom = new Garcom("Philipe Vieira", "154.364.758-51", 2200.00);
        Ajudante ajudante = new Ajudante("Gabriel do Ó", "678.478.351-28", 1600.00, "Noturno");

        repo.create(gerente);
        repo.create(garcom);
        repo.create(ajudante);

        System.out.println("Funcionários criados com os IDs: " + gerente.getId() + ", " + garcom.getId() + ", " + ajudante.getId());

        System.out.println("\nTESTE READ");
        List<Funcionario> todos = repo.loadAll();
        for (Funcionario f : todos) {
            System.out.println(f);
        } 

        Funcionario buscado = repo.loadFromId(garcom.getId());
        System.out.println("Busca por ID (" + garcom.getId() + "): " + buscado);

        System.out.println("\nTESTE UPDATE");
        garcom.setSalario(2500.00);
        repo.update(garcom);
        System.out.println("depois da atualização do salário do garçom: " + repo.loadFromId(garcom.getId()));

        System.out.println("\nTESTE DELETE");
        System.out.println("Removendo ajudante do ID: " + ajudante.getId());
        repo.delete(ajudante);

        System.out.println("\nListagem final no banco:");
        for (Funcionario f : repo.loadAll()) {
            System.out.println(f);
        }

        db.close();
    }
}