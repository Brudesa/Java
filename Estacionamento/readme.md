# Estacionamento Inteligente

Este é um projeto simples em Java que simula um sistema de cálculo de tarifas para um estacionamento. O sistema é executado via linha de comando e calcula o valor a ser pago com base no tempo de permanência do veículo.

## Funcionalidades

- **Entrada de Dados**: O usuário pode inserir a placa do veículo e o tempo de permanência em minutos.
- **Cálculo de Tarifa**: O sistema calcula o valor a ser pago de acordo com uma tabela de preços progressiva.
- **Mensagens Personalizadas**: Exibe uma mensagem de agradecimento ao usuário, que varia conforme o tempo de permanência.
- **Validação de Entrada**: O sistema valida a entrada de tempo para garantir que apenas números positivos sejam inseridos.

## Regras de Preço

A tarifa é calculada da seguinte forma:

| Tempo de Permanência | Valor a Pagar |
| :--- | :--- |
| Até 60 minutos | R$ 5,00 |
| Entre 61 e 180 minutos | R$ 10,00 |
| Acima de 180 minutos | R$ 10,00 + R$ 2,00 por hora adicional* |

\* *Qualquer fração de hora adicional é cobrada como uma hora completa.*

## Tecnologias Utilizadas

- **Java**: O projeto é totalmente desenvolvido em Java, utilizando conceitos básicos de Orientação a Objetos.

## Como Executar o Projeto

Para compilar e executar o projeto, siga os passos abaixo no seu terminal:

1.  **Navegue até a pasta do projeto**:
    ```bash
    cd /caminho/para/seu/projeto
    ```

2.  **Compile os arquivos Java**:
    ```bash
    javac Aplicacao.java Veiculo.java CalculadoraEstacionamento.java
    ```

3.  **Execute a aplicação principal**:
    ```bash
    java Aplicacao
    ```

Após a execução, o programa solicitará a placa do veículo e o tempo de permanência para realizar o cálculo.

## Estrutura do Projeto

O projeto é composto por três classes principais:

- `Aplicacao.java`: A classe principal (`main`) que gerencia a interação com o usuário, coleta os dados e exibe o resultado final.
- `Veiculo.java`: Uma classe de modelo que representa o veículo, armazenando a placa e o tempo de permanência.
- `CalculadoraEstacionamento.java`: A classe de serviço que contém a lógica de negócio para calcular o valor da tarifa e gerar as mensagens personalizadas.
