# Validador de CPF em Java

Este é um projeto simples em Java que demonstra como validar um número de Cadastro de Pessoas Físicas (CPF) brasileiro. O programa verifica a estrutura, sequências repetidas e os dígitos verificadores para determinar a validade do CPF informado.

## Funcionalidades

- **Entrada de Dados:** O usuário pode inserir um número de CPF através do console.
- **Validação Estrutural:** O sistema verifica se o CPF possui 11 dígitos.
- **Verificação de Sequências:** Impede que CPFs com todos os números repetidos (ex: 111.111.111-11) sejam considerados válidos.
- **Cálculo dos Dígitos Verificadores:** O algoritmo calcula os dois dígitos verificadores do CPF e os compara com os dígitos informados para confirmar a autenticidade do número.

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
     java Aplicacao
     ```
   - O programa solicitará que você digite o CPF. Insira o número e pressione Enter para ver o resultado da validação.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- **`CPF.java`:** Uma classe que representa o documento CPF. Ela armazena o número e realiza validações básicas, como a verificação do tamanho e de sequências de números repetidos.
- **`ValidadorCPF.java`:** Contém a lógica principal para a validação do CPF, incluindo o cálculo dos dígitos verificadores, seguindo o algoritmo oficial.
- **`Aplicacao.java`:** A classe principal que interage com o usuário, recebe o CPF e utiliza as outras classes para realizar a validação e exibir o resultado.
