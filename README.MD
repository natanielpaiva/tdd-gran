# Projeto de Gerenciamento de Tarefas

Este projeto é uma aplicação simples de gerenciamento de tarefas, desenvolvida com o objetivo de aplicar a metodologia Test-Driven Development (TDD) utilizando Java e JUnit 5.

## Funcionalidades

- Adicionar tarefas à lista de tarefas.
- Listar todas as tarefas.
- Marcar tarefas como concluídas.
- Listar apenas tarefas pendentes.

## Tecnologias Utilizadas

- Java
- JUnit 5

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- `src/main/java/`: Contém o código fonte da aplicação.
    - `GerenciadorDeTarefas.java`: Classe responsável pelo gerenciamento das tarefas.
    - `Tarefa.java`: Classe que representa uma tarefa individual.
- `src/test/java/`: Contém os testes unitários da aplicação.
    - `GerenciadorDeTarefasTest.java`: Testes unitários para a classe `GerenciadorDeTarefas`.

## Como Executar

Para executar este projeto, você precisará de um ambiente de desenvolvimento Java configurado e uma IDE que suporte JUnit 5, como IntelliJ IDEA, Eclipse ou NetBeans.

### Passos:

1. Clone o repositório para o seu ambiente local.
2. Abra o projeto na sua IDE de escolha.
3. Para executar os testes, navegue até a pasta `src/test/java/` e execute `GerenciadorDeTarefasTest.java` usando a funcionalidade de teste da sua IDE.
