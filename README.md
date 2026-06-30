# Fundamentos de Grafos e Busca em Largura (BFS)

## Descrição

Este projeto foi desenvolvido com o objetivo de demonstrar os conceitos fundamentais da Teoria dos Grafos e a implementação do algoritmo de Busca em Largura (Breadth-First Search - BFS) utilizando a linguagem Java.

O sistema permite criar um grafo não direcionado, representar suas conexões por meio de uma Matriz de Adjacência e realizar buscas utilizando o algoritmo BFS.

---

## Conceitos Fundamentais

### Vértice

Um vértice representa um elemento ou ponto dentro de um grafo.

Exemplo:

```text
0    1    2
```

---

### Aresta

Uma aresta representa uma conexão entre dois vértices.

Exemplo:

```text
0 ----- 1
```

---

### Grau de um Vértice

O grau corresponde à quantidade de arestas conectadas a um vértice.

Exemplo:

```text
    1
    |
0---2---3
```

O vértice 2 possui grau 3.

---

### Grafos Direcionados

Em grafos direcionados, as arestas possuem sentido.

Exemplo:

```text
0 → 1
```

---

### Grafos Não Direcionados

Em grafos não direcionados, as conexões são bidirecionais.

Exemplo:

```text
0 ----- 1
```

Este projeto utiliza grafos não direcionados.

---

### Grafos Ponderados

Grafos ponderados possuem pesos associados às arestas.

Exemplo:

```text
0 --5-- 1
```

O número 5 representa o custo ou peso da conexão.

Este projeto não utiliza pesos nas arestas.

---

## Estrutura do Projeto

### Classe Grafo

Responsável por armazenar os vértices e arestas utilizando uma estrutura baseada em Map.

Principais responsabilidades:

* Adicionar vértices;
* Adicionar arestas;
* Armazenar as conexões do grafo.

---

### Classe MatrizAdjacencia

Responsável por converter a estrutura de armazenamento do grafo para uma matriz de adjacência.

Exemplo:

```text
    0 1 2
0 [ 0 1 1 ]
1 [ 1 0 0 ]
2 [ 1 0 0 ]
```

Onde:

* 1 indica existência de conexão;
* 0 indica ausência de conexão.

---

### Classe BFS

Implementa o algoritmo de Busca em Largura (Breadth-First Search).

Principais estruturas utilizadas:

* Fila (Queue);
* Vetor de vértices visitados.

---

### Classe Menu

Responsável pela interação com o usuário através do terminal.

Permite:

* Adicionar arestas;
* Visualizar a matriz de adjacência;
* Executar a BFS;
* Encerrar o programa.

---

### Classe Main

Ponto de entrada da aplicação.

Responsável por iniciar o menu do sistema.

---

## Matriz de Adjacência

A matriz de adjacência é uma estrutura bidimensional que representa as conexões entre os vértices de um grafo.

### Vantagens

* Implementação simples;
* Consulta de arestas em tempo constante O(1);
* Boa para grafos densos.

### Desvantagens

* Consumo elevado de memória;
* Espaço O(V²);
* Desperdício de memória em grafos esparsos.

---

## Busca em Largura (BFS)

A Busca em Largura explora os vértices por níveis.

Exemplo:

```text
      0
     / \
    1   2
   /     \
  3       4
```

Iniciando pelo vértice 0:

```text
0 → 1 → 2 → 3 → 4
```

### Funcionamento

1. Marca o vértice inicial como visitado;
2. Insere o vértice na fila;
3. Remove o primeiro elemento da fila;
4. Visita todos os seus vizinhos não visitados;
5. Adiciona os vizinhos à fila;
6. Repete o processo até que a fila esteja vazia.

---

## Complexidade Computacional

Como a implementação utiliza Matriz de Adjacência, a complexidade da BFS é:

```text
O(V²)
```

Onde:

* V = quantidade de vértices.

Caso fosse utilizada Lista de Adjacência, a complexidade seria:

```text
O(V + E)
```

Onde:

* V = quantidade de vértices;
* E = quantidade de arestas.

---

## Exemplo de Execução

```text
===== MENU =====
1 - Adicionar aresta
2 - Exibir matriz de adjacência
3 - Executar BFS
0 - Sair
```

Exemplo de BFS:

```text
Vértice inicial: 0

BFS:
0 1 2 3 4
```

---

## Tecnologias Utilizadas

* Java 26
* IntelliJ IDEA
* Estruturas de Dados (Map, List, Queue)
* Matriz de Adjacência
* Algoritmo Breadth-First Search (BFS)

---

## Autores

Trabalho desenvolvido para a disciplina de Estrutura de Dados e Teoria dos Grafos, com foco na representação de grafos e no algoritmo de Busca em Largura (BFS).
