# Projeto Lanchonete EduTech

Um sistema simples de gerenciamento de lanchonete desenvolvido em Java, utilizando a biblioteca Swing para a interface gráfica. Este projeto simula um ponto de venda onde os usuários podem selecionar itens de um cardápio, visualizar o resumo do pedido e o custo total.

## Funcionalidades

- **Interface Gráfica:** Interface amigável para interação do usuário.
- **Cardápio Dinâmico:** Exibição dos itens do cardápio de forma clara.
- **Gerenciamento de Pedidos:** Adição de itens ao pedido com atualização em tempo real.
- **Cálculo de Total:** Cálculo automático do valor total do pedido.

## Como Executar o Projeto

Para compilar e executar o projeto, siga os passos abaixo:

1. **Pré-requisitos:**
   - É necessário ter o Java Development Kit (JDK) instalado em sua máquina.

2. **Compilação:**
   - Abra o terminal ou prompt de comando na pasta raiz do projeto.
   - Execute o comando abaixo para compilar todos os arquivos `.java`:
     ```bash
     javac *.java
     ```

3. **Execução:**
   - Após a compilação bem-sucedida, execute o programa com o seguinte comando:
     ```bash
     java TelaLanchonete
     ```

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- **`Item.java`:** Define a estrutura de um item do cardápio, contendo nome e preço.
- **`Cardapio.java`:** Gerencia a lista de itens disponíveis no cardápio.
- **`Pedido.java`:** Representa o pedido do cliente, permitindo adicionar itens e calcular o valor total.
- **`TelaLanchonete.java`:** É a classe principal que cria a interface gráfica do sistema e gerencia a interação com o usuário.
