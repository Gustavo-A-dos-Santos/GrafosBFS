# 📊 Gerenciador de Grafos & Busca em Largura (BFS)

### 🏫 Seminário — Estrutura de Dados I · IFTM Campus Patrocínio
- **Professor:** Júnio Moreira
- **Membros do grupo:** Julia, Gustavo, Karine, Pedro Bazilio, Carlos, Pedro

---

## 📌 Sobre o projeto

Este projeto consiste em um sistema interativo desenvolvido em **Java** para terminal, projetado para facilitar a criação, manipulação e estudo de estruturas de **grafos** utilizando o conceito de **matriz de adjacência**.

A aplicação foi totalmente reformulada com foco na experiência do usuário (UX) no console, organizando as operações por blocos lógicos e entregando relatórios visuais limpos e legíveis para apresentações acadêmicas e avaliações.

---

## ⚙️ Funcionalidades

* **📂 Carga Automática:** Inicializa instantaneamente um grafo padrão com 6 vértices (`A` até `F`) para testes rápidos.
* **📊 Visualização Avançada:**
    * Exibição da Matriz de Adjacência com substituição de zeros por pontos (`·`) para melhor leitura das conexões.
    * Cálculo dinâmico de graus dos vértices, diferenciando **Grau de Entrada** e **Grau de Saída** caso o grafo possua arestas direcionadas.
* **⚡ Estruturas Suportadas:** Suporte a arestas não-direcionadas (comuns), direcionadas (digrafos) e ponderadas (com peso).
* **🧠 Algoritmos de Busca:** Execução da **Busca em Largura (BFS)** passo a passo, mostrando em tempo real o vértice visitado, os vizinhos descobertos e o estado da fila (`Queue`).

---

## 🖥️ Visualização do sistema

### Matriz de adjacência formatada

O sistema limpa o excesso de poluição visual substituindo os valores zerados, destacando onde realmente existem conexões:

```text
========= MATRIZ DE ADJACÊNCIA =========

       A   B   C   D   E   F
    ┌────────────────────────┐
  A │  ·   1   1   1   ·   · │
  B │  1   ·   ·   ·   1   · │
  C │  1   ·   ·   ·   ·   · │
  D │  1   ·   ·   ·   ·   1 │
  E │  ·   1   ·   ·   ·   1 │
  F │  ·   ·   ·   1   1   · │
    └────────────────────────┘
