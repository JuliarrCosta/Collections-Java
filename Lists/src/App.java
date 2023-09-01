package Lists.src;

public class App {
    public static void main(String[] args) throws Exception {
        ListaTarefas tarefasDiarias = new ListaTarefas();
        tarefasDiarias.adicionarTarefas("1- Arruamar a casa");
        tarefasDiarias.adicionarTarefas("2- Estudar banco de dados.");
        tarefasDiarias.mostrarDescricao();
        
    }
}
