package gran.faculdade.negocio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// me siga no @natanieltech
class GerenciadorDeTarefasTest {

    private GerenciadorDeTarefas gerenciador;

    @BeforeEach
    void setUp() {
        gerenciador = new GerenciadorDeTarefas();
    }

    @Test
    void testAdicionarTarefa() {
        gerenciador.adicionarTarefa("Comprar leite");
        assertEquals(1, gerenciador.getTarefas().size(), "Deveria ter 1 tarefa na lista");
        assertEquals("Comprar leite", gerenciador.getTarefas().get(0).getDescricao(), "A descrição da tarefa não confere");
    }

    @Test
    void testConcluirTarefa() {
        gerenciador.adicionarTarefa("Comprar leite");
        gerenciador.concluirTarefa(0);
        assertTrue(gerenciador.getTarefas().get(0).isConcluida(), "A tarefa deveria estar concluída");
    }

    @Test
    void testListarTarefasPendentes() {
        gerenciador.adicionarTarefa("Comprar leite");
        gerenciador.adicionarTarefa("Enviar email");
        gerenciador.concluirTarefa(0);
        assertEquals(1, gerenciador.getTarefasPendentes().size(), "Deveria ter 1 tarefa pendente");
        assertEquals("Enviar email", gerenciador.getTarefasPendentes().get(0).getDescricao(), "A descrição da tarefa pendente não confere");
    }
}
