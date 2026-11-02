# Sistema de Gerenciamento dos Funcionarios de um Restaurante 

Utilizando a biblioteca ORMLite e um banco de dados SQLLite em java para armazenar os dados dos funcionarios.

## Classe de Modelo

Modela a gestão de funcionários do restaurante através do conceito de herança:
- **`Funcionario`**: Classe base abstrata anotada com `@DatabaseTable(tableName = "funcionario")`. Define os atributos comuns no SQLite: `id`, `nome`, `cpf`, `salario` e `cargo`.
- **`Gerente`**, **`Garcom`**, **`Ajudante`**: Subclasses que estendem `Funcionario`. A subclasse `Ajudante` adiciona o campo específico `turno` pois é o unico que trabalha turnos diferente.

## Implementação das Operações CRUD

A persistência é gerenciada pela classe `FuncionarioRepository`, que encapsula a interface `Dao<Funcionario, Integer>` do ORMLite:

- **Create**: O método `create(Funcionario funcionario)` salva a instância concreta via `dao.create(funcionario)` e atualiza a lista de memória `loadedFuncionarios`.
- **Read**: Métodos `loadFromId(int id)` e `loadAll()` efetuam as leituras `dao.queryForId(id)` e `dao.queryForAll()`, recriando o estado interno do repositório (`loadedFuncionario` e `loadedFuncionarios`).
- **Update**: O método `update(Funcionario funcionario)` atualiza o registro no SQLite chamando `dao.update(funcionario)`.
- **Delete**: O método `delete(Funcionario funcionario)` remove o registro do banco de dados via `dao.delete(funcionario)` e limpa a referência na memória.

### Execução dos Testes no BlueJ:
![Operações CRUD](./Captura%20de%20tela%202026-11-02%20025734.png)