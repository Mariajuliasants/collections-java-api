package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
//atributo
private List<Tarefa> tarefaList;

public ListaTarefas() {
    this.tarefaList = new ArrayList<>();
}

public void adicionarTarefa(String descricao){
    tarefaList.add(new Tarefa(descricao));
}
public void removerTarefa(String descricao){
   List<Tarefa> tarefasParaRemover = new ArrayList<>();
   for (Tarefa tarefa : tarefaList) {
    if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
        tarefasParaRemover.add(tarefa);
    }
   }
   tarefaList.removeAll(tarefasParaRemover);
   // se usasse o remove e não fizesse o laço de repetição não iria identificar as tarefas repetidas
}
public int obterNumeroTotalTarefas(){
    return tarefaList.size();
    //size representa a quantidade de elemento que eu tenho dentro da list
}
public void obterDescricoesTarefas(){
    System.out.println(tarefaList);
}
public static void main(String[] args) {
    ListaTarefas listaTarefas = new ListaTarefas();
    System.out.println(" numero total de elementos "+listaTarefas.obterNumeroTotalTarefas());
    listaTarefas.adicionarTarefa("tarefa 1");
    listaTarefas.adicionarTarefa("tarefa 2"); 
    listaTarefas.adicionarTarefa("tarefa 2"); 
    System.out.println(" numero total de elementos "+listaTarefas.obterNumeroTotalTarefas());
    
    listaTarefas.removerTarefa("tarefa 2");
    System.out.println(" numero total de elementos "+listaTarefas.obterNumeroTotalTarefas());
    
    listaTarefas.obterDescricoesTarefas();
}
}
