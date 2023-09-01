package Lists.src;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    
    private List <Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefas(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    
    public void removerTarefas(String descricao){
       List<Tarefa> tarefasParaRemover = new ArrayList<>();
       for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
       }
       tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTarefas(){
        return tarefaList.size(); //método size retorna a quantidade de elementos da lista 
    }

    public void mostrarDescricao(){
        System.out.println(tarefaList);
    }
}
