# Sistema de Relatório de Vendas

Este é um projeto de desktop desenvolvido em Java com Swing que permite a um usuário registrar uma venda, adicionar múltiplos produtos e, ao final, gerar um relatório detalhado com indicadores-chave.

## Funcionalidades

- **Interface Gráfica Simples**: Construído com Java Swing para facilitar a interação do usuário.
- **Cadastro de Vendas**: Inicia uma nova venda associada a um nome de cliente.
- **Adição de Produtos**: Permite adicionar múltiplos produtos a uma venda, especificando nome, preço e quantidade.
- **Geração de Relatório**: Cria um relatório de texto completo da venda, que inclui:
    - Lista de todos os itens vendidos com seus totais.
    - Valor total da venda.
    - Quantidade total de produtos.
    - Valor do ticket médio.
    - O produto mais caro da venda.

## Arquitetura do Projeto

O projeto segue uma arquitetura de 3 camadas para separar as responsabilidades, tornando o código mais organizado e manutenível:

- **`model`**: Contém as classes de dados que representam as entidades do sistema.
    - `Produto.java`: Representa um produto com nome, preço e quantidade.
    - `Venda.java`: Representa uma venda, contendo um cliente e uma lista de produtos.

- **`service`**: Contém a lógica de negócio do sistema.
    - `RelatorioService.java`: Responsável por processar os dados de uma venda e formatar o relatório final.

- **`ui`**: Contém as classes responsáveis pela interface gráfica e interação com o usuário.
    - `TelaVendas.java`: A janela principal da aplicação, onde o usuário adiciona produtos e solicita o relatório.

## Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto.
- **Java Swing**: Biblioteca utilizada para a criação da interface gráfica (GUI).

## Como Executar o Projeto

Para compilar e executar o projeto a partir do código-fonte, siga os passos abaixo no seu terminal.

1.  **Navegue até a pasta raiz do projeto** (a pasta que contém os diretórios `model`, `service` e `ui`):
    ```bash
    cd D:\PROJETOS\MESTRA\JAVA\Relatorio de Vendas
    ```

2.  **Compile todos os arquivos Java**:
    O comando abaixo irá compilar todos os arquivos `.java` e colocar os arquivos `.class` nos diretórios correspondentes.
    ```bash
    javac model/*.java service/*.java ui/*.java
    ```

3.  **Execute a aplicação principal**:
    Após a compilação, execute a classe que contém o método `main`, que neste caso é a `TelaVendas`.
    ```bash
    java ui.TelaVendas
    ```

Ao executar, a janela do sistema será aberta, solicitando o nome do cliente para iniciar uma nova venda.
