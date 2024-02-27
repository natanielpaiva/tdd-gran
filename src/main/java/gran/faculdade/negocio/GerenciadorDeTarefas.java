package gran.faculdade.negocio;

import gran.faculdade.dominio.Tarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
// me siga no @natanieltech
public class GerenciadorDeTarefas {
    private List<Tarefa> tarefas;

    public GerenciadorDeTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao);
        tarefas.add(novaTarefa);
    }

    public void concluirTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).concluir();
        }
    }

    public List<Tarefa> getTarefas() {
        return new ArrayList<>(tarefas); // Retorna uma cópia para evitar manipulação externa
    }

    public List<Tarefa> getTarefasPendentes() {
        return tarefas.stream()
                .filter(tarefa -> !tarefa.isConcluida())
                .collect(Collectors.toList());
    }
}
